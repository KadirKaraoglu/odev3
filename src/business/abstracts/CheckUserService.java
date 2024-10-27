package business.abstracts;

import entities.concretes.User;
import java.util.List;

public interface CheckUserService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user,List<User> users);
	boolean checkPassword(User user);
	boolean checkFormatEmail(User user);
	boolean checkUser(User user);

}//testtt
