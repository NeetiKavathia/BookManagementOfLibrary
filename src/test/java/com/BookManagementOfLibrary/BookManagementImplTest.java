package com.BookManagementOfLibrary;



import javax.persistence.Column;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class BookManagementImplTest extends TestCase {

	BookManagementImpl i;
	@Test
	
	public void testEquality(User b1,User b2)
	{
		assertEquals(b1.getId(),b2.getId());	
		assertEquals(b1.getFine(),b2.getFine());
		assertEquals(b1.getName(),b2.getName());
	}
	
	public void testFindByBook()
	{
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		i = (BookManagementImpl) appContext.getBean("bookBo");
		User input = new User();
		input.setId(1);
		input.setName("abc");
		input.setContact(123);
		input.setFine(20);
		
//		User result=null;
//		try {
//			result = i.FindByName("abc");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		User toCheck=i.FindByName("abc");
		

		testEquality(toCheck, input);
	}
}
