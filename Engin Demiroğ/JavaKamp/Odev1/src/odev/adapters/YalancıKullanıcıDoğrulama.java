package odev.adapters;

import odev.entities.concretes.Oyuncu;

public class YalancıKullanıcıDoğrulama implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Oyuncu oyuncu) {
		System.out.println("Kullanıcı Doğrulandı");
		return true;
	}

}