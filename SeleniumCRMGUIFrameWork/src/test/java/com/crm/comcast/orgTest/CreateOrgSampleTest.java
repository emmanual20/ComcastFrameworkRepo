package com.crm.comcast.orgTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.generic.baseUtility.BaseClass;

public class CreateOrgSampleTest extends BaseClass {
	
	@Test
	public void createOrg() {
		System.out.println("execute create org and verify");
	}
	@Test
	public void createOrgWithIndustry() {
		System.out.println("execute create org withIndustry and verify");
	}

	
}
