package odev.adapters;

import odev.entities.concretes.Oyuncu;

public class Parmak�ziDo�rulama implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Oyuncu oyuncu) {
		System.out.println("Parmak �zi Do�rulanm��");
		return true;
	}

}
