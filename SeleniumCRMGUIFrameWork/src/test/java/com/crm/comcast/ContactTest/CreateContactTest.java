package com.crm.comcast.ContactTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.generic.baseUtility.BaseClass;

public class CreateContactTest extends BaseClass {
	

	@Test
	public void createContact() {
		System.out.println("execute create contact & verify");
	}
	@Test
	public void createContactDate() {
		System.out.println("execute create contact withSD and Verify");
	}
	
}
	

