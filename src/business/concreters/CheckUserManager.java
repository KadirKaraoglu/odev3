package business.concreters;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.CheckUserService;
import entities.concretes.User;

public class CheckUserManager implements CheckUserService{ 
	private UserVerificitionManager service;

	public CheckUserManager(UserVerificitionManager service) {
		this.service = service;
	}

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("İsim 2 hardten az olamaz");
		return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length() < 2) {
			System.out.println("Soy ismi 2 karakterden az olamaz!");
			return false;
		}
		else {
			return true;
		}			
	}

	@Override
	public boolean checkEmail(User user, List<User> users) {
	for (User user1 : users) {
			
			if (user1.getEmail().equals(user.getEmail())) {
				System.out.println("Bu e-mail daha önce kullanılmış! Yeni bir email giriniz.");
				return false;
			}
			
		}
		return true;	
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Parola 6 karakterden az olamaz!");
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean checkFormatEmail(User user) {
		String regex = "[a-zA-Z][\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.matches();
			
	}

	@Override
	public boolean checkUser(User user) {

		if ( (checkFirstName(user)) && (checkLastName(user)) 
				&& (checkPassword(user)) && (this.service.validate())  ) {
			return true;
		}
		else {
			return false;
		}
	}

	

}
