package Odev.business.abstracts;

import Odev.entities.Oyuncu;

public interface OyuncuService {
	void giris(Oyuncu oyuncu);
	void hesapSil(Oyuncu oyuncu);
	void hesapG�ncelle(Oyuncu oyuncu);
}
