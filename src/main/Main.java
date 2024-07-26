package main;

import business.concreters.CheckUserManager;
import business.concreters.UserManager;
import business.concreters.UserVerificitionManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"kadir","karaoglu","kadirkrgl16@gmail.com","1232456");
	UserVerificitionManager managers = new UserVerificitionManager();
		CheckUserManager checkUserManager = new CheckUserManager(managers );
		UserDao dao = new HibernateUserDao() ;
		
		UserManager manager = new UserManager(checkUserManager,dao);
		manager.addUser(user);
		manager.logIn(user);
	}

}
