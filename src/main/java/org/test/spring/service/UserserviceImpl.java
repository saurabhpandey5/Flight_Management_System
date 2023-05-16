package org.test.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.test.spring.Model.Users;
import org.test.spring.dao.UserDao;
import org.test.spring.exception.ResourceNotFoundException;

@Service
public class UserserviceImpl implements Userservice {

	private UserDao userDao;

	public UserserviceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Users saveuser(Users users) {

		return userDao.save(users);
	}

	@Override
	public List<Users> getAllUsers() {
		return (List<Users>) userDao.findAll();
	}

	public Users getUserById(long id) {
		return userDao.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Exception","id",id));
	}

	@Override
	public void deleteuser(long id) {
		userDao.deleteById(id);
		
	}
}
