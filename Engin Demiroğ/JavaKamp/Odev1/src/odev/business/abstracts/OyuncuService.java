package odev.business.abstracts;




import odev.entities.concretes.Oyuncu;

public interface OyuncuService {
	void Kay�tOlma(Oyuncu oyuncu);
	void HesapSil(Oyuncu oyuncu);
	void HesapGuncelle(Oyuncu oyuncu);
	//List<Oyun> OyunGetir(Oyuncu oyuncu);
	
	
}
