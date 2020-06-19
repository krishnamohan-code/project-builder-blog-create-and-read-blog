package dao;

import org.apache.catalina.User;

public interface UserDaoInterface {
	int signUp(User user);
	boolean loginUser(User user);
}
