package org.test.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.spring.Model.Users;
import org.test.spring.service.Userservice;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {

	@Autowired
	private Userservice userservice;

	public Usercontroller(Userservice userservice) {
		super();
		this.userservice = userservice;
	}

	@PostMapping() // Adding -- Create method...
	public ResponseEntity<Users> saveEmployee(@RequestBody Users users) {
		return new ResponseEntity<Users>(userservice.saveuser(users), HttpStatus.CREATED);
	}

	@GetMapping()
	public List<Users> getAllUsers() {
		return userservice.getAllUsers();
	}

	@GetMapping("{id}")
	public ResponseEntity<Users> getUserById(@PathVariable("id") Long userId) {
		return new ResponseEntity<Users>(userservice.getUserById(userId), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public void deleteuser(@PathVariable("id") Long id) {
		userservice.deleteuser(id);
	}
}
