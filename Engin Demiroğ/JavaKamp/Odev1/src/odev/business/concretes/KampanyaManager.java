package odev.business.concretes;

import odev.business.abstracts.KampanyaService;
import odev.entities.concretes.Kampanya;
import odev.entities.concretes.Oyun;

public class KampanyaManager implements KampanyaService{
	
	private Oyun oyun;
	
	public KampanyaManager(Oyun oyun) {
		super();
		this.oyun = oyun;
	}

	@Override
	public void Ekle(Kampanya kampanya) {
		System.out.println(kampanya.getIsim()+"Eklendi ve "+kampanya.getIndirimOrani()+oyun.getIsim()
		+ "isimli oyuna Uyguland� Oyunun Yeni Fiyat� : "+oyun.get�cret()*kampanya.getIndirimOrani());
		
		
	}

	@Override
	public void Silme(Kampanya kampanya) {
		System.out.println(kampanya.getIsim()+"Kampanya Kald�r�ld�");
		
	}

	@Override
	public void Guncelleme(Kampanya kampanya) {
		System.out.println(kampanya.getIsim()+"Kampanya G�ncellendi yeni indirim orani " + kampanya.getIndirimOrani());
		
	}

}
