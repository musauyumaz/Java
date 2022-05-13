package odev.business.concretes;

import odev.business.abstracts.OyunService;
import odev.entities.concretes.Kampanya;
import odev.entities.concretes.Oyun;
import odev.entities.concretes.Oyuncu;

public class OyunManager implements OyunService{

	private Oyuncu oyuncu;
	private Kampanya kampanya;
	public OyunManager(Oyuncu oyuncu,Kampanya kampanya) {
		this.oyuncu = oyuncu;
		this.kampanya = kampanya;
	}

	@Override
	public void Ekle(Oyun oyun) {
		System.out.println("Oyun Eklendi : " + oyun.getIsim());
		
	}

	@Override
	public void Sil(Oyun oyun) {
		System.out.println("Oyun Silindi : " + oyun.getIsim());
		
	}

	@Override
	public void Guncelle(Oyun oyun) {
		System.out.println("Oyun G�ncellendi : " + oyun.getIsim());
		
	}

	@Override
	public void Satmak(Oyun oyun) {
		double sonuc = oyun.get�cret()-(oyun.get�cret()*kampanya.getIndirimOrani());
		System.out.println("Oyun Sat�ld� : " + oyun.getIsim()+" "+ oyuncu.getAd() +" isimli kullan�c�ya "+kampanya.getIsim()+" kampanyas�yla " +sonuc+" sat�ld�" );
		
	}

}
