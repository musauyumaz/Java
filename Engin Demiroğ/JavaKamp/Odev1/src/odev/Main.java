package odev;

import java.time.LocalDate;
import java.util.ArrayList;

import odev.adapters.CustomerCheckService;
import odev.adapters.MernisServiceAdapter;
import odev.adapters.Parmak�ziDo�rulama;
import odev.adapters.Yalanc�Kullan�c�Do�rulama;
import odev.business.concretes.KampanyaManager;
import odev.business.concretes.OyunManager;
import odev.business.concretes.OyuncuManager;
import odev.entities.concretes.Kampanya;
import odev.entities.concretes.Oyun;
import odev.entities.concretes.Oyuncu;

public class Main {

	public static void main(String[] args) {
		Oyuncu oyuncu1 = new Oyuncu();
		oyuncu1.setId(1);
		oyuncu1.setAd("Musa");
		oyuncu1.setSoyad("Uyumaz");
		oyuncu1.setTcNo("22313213321");
		//oyuncu1.setDogumTarihi(LocalDate.of(1999,14,02));
		Oyun oyun1 = new Oyun(1,"Pubg",100);
		Kampanya kampanya1 = new Kampanya(1,"%30Kampanyas�",0.3);
		
		OyuncuManager oyuncuKay�t = new OyuncuManager(new Parmak�ziDo�rulama());
		oyuncuKay�t.Kay�tOlma(oyuncu1);
			
		ArrayList<String> kullan�c�lar = new ArrayList();	
		
		//oyuncuManager.Kay�tOlma(oyuncu1);
//		oyuncuManager.HesapSil(oyuncu1);
//		oyuncuManager.HesapGuncelle(oyuncu1);
		
//		KampanyaManager kampanyaManager = new KampanyaManager(oyun1);
//		kampanyaManager.Ekle(kampanya1);
//		kampanyaManager.Guncelleme(kampanya1);
//		kampanyaManager.Silme(kampanya1);
//		
//		OyunManager oyunManager = new OyunManager(oyuncu1,kampanya1);
//		oyunManager.Ekle(oyun1);
//		oyunManager.Sil(oyun1);
//		oyunManager.Satmak(oyun1);
		
		
		
	}

}
