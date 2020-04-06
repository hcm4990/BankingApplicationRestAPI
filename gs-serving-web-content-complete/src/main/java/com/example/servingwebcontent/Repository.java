package com.example.servingwebcontent;

import org.springframework.data.repository.CrudRepository;

import com.example.servingwebcontent.a_user;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Repository extends CrudRepository<a_user, Long> {

	void save(account n);
	
	void deleteUser(account n);
	
	void deleteAccount(account n);
	
	void withdrawMoney(account n);
	
	void depositMoney(account n);
	
	void getLoan(loan n);

}
