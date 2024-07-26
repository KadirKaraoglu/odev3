package business.concreters;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	private CheckUserManager checkUserManager;
	private UserDao userDao;

	public UserManager(CheckUserManager checkUserManager,UserDao userDao) {
		this.checkUserManager = checkUserManager;
		this.userDao=userDao;
	
	}
	

	@Override
	public void addUser(User user) {
		if(checkUserManager.checkUser(user)) {
			System.out.println("uye eklendi");
			userDao.add(user);
		}
	
		else {
			System.out.println("uye eklenemedi");
		}
	}

	@Override
	public void logIn(User user) {
		
		
	}
	

}
