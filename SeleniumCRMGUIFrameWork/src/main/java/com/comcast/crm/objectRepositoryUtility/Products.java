package com.comcast.crm.objectRepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author qwertyu
 * 
 */
public class Products {
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement createProductImgBtn;

	@FindBy(name="searchBtn")
	private WebElement ele2;
}
