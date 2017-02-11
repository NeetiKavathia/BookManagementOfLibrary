package com.BookManagementOfLibrary;

import java.util.List;

public interface BookManagement{
	/**
	 * @param b: Object of User which is to be added in the database
	 */
	public void NewUser(User b);
	/**
	 * @param b: Object of the user that is to be deleted
	 */
	public void DeleteUser(User b);
	/**
	 * @return List of all the users in the database
	 */
	public List<User> ViewUser();
	/**
	 * @param b: Object of the User which is to be updated
	 * @param n: Updated contact number
	 */
	public void UpdateContactOfUser(User b,int n);
	public User FindByName(String a);
}