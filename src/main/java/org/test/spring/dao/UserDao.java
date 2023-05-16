package org.test.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.spring.Model.Users;

@Repository
public interface UserDao extends CrudRepository<Users, Long> {

	
}
