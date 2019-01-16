package com.developer.SpringMySQL.model;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	
	@Column(name = "phoneno")
	public String phoneNo;
	
    @Column(name = "personname")
	public String personName;
    
	public Contact(){
		
	}

	public Contact(String personName, String phoneNo) {
		this.personName = personName;
		this.phoneNo = phoneNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
