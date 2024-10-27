package google;

import entities.concretes.User;

public class CheckUserManager {
	public void add(User user) {
		System.out.println("google ile"+user.getFirstName() +"isimli kullanici eklendi");
	}
	

}
