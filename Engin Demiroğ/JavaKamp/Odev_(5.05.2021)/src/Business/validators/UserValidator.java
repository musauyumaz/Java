package Business.validators;

import Entities.concretes.User;

public class UserValidator implements Validator{

	@Override
	public boolean registerIsValid(User user) {
		user.getFirstName();
		return true;
		
	}

	@Override
	public boolean logInIsValid(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
