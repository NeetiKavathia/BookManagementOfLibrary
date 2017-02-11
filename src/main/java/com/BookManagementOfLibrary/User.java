package com.BookManagementOfLibrary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "id")
	private int id;
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	private String name;
	@Column(name = "fine")
	private int fine;
	@Column(name = "contact")
	private int contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

}
