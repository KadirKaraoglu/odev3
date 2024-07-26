package core;

import entities.concretes.User;
import google.CheckUserManager;

public class GoogleManager implements GoogleService{

	@Override
	public void add(User user) {
		CheckUserManager checkUserManager = new  CheckUserManager();
		checkUserManager.add(user);
		
		
	}

}
