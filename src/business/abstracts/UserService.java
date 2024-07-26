package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void addUser(User user);
	void logIn(User user);

}
