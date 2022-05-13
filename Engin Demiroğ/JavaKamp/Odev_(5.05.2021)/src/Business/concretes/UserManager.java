package Business.concretes;



import Business.abstracts.UserService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao ;
	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public void logIn(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(User user) {
		userDao.register(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}



}
