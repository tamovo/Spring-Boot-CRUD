package com.developer.SpringMySQL.model;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepo extends CrudRepository<Contact, Integer>{

	//Contact findOne(int id);

}
