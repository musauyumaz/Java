package odev.adapters;

import odev.entities.concretes.Oyuncu;

public class ParmakİziDoğrulama implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Oyuncu oyuncu) {
		System.out.println("Parmak İzi Doğrulanmış");
		return true;
	}

}
