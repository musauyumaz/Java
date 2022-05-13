package DataAccess.concretes.InMemory;



import DataAccess.abstracts.UserDao;
import Entities.concretes.User;


 	
public class InMemoryUserDao implements UserDao{
		
	@Override
	public void register(User user) {
		System.out.println("�ye olundu" + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi" + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� sistemden silindi" + user.getFirstName());
		
	}

	
	
	
}
