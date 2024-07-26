package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface CheckUserService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user,List<User> users);
	boolean checkPassword(User user);
	boolean checkFormatEmail(User user);
	boolean checkUser(User user);

}
