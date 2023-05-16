package org.test.spring.service;

import java.util.List;

import org.test.spring.Model.Users;

public interface Userservice {

	Users saveuser(Users users);

	// to read the employee record
	List<Users> getAllUsers();

	// to read single emp
	Users getUserById(long id);

	// to update employee record
	//Users updateEmployee(Users users, long id);
	
	void  deleteuser(long id);
}
