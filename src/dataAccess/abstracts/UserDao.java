package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
    void updateUser(User user);
	void deleteUser(User user);
	List<User> getAllUsers();
}
