package odev.adapters;

import odev.entities.concretes.Oyuncu;

public class Yalanc�Kullan�c�Do�rulama implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Oyuncu oyuncu) {
		System.out.println("Kullan�c� Do�ruland�");
		return true;
	}

}