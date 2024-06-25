package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Pavan kumar rajbhar
 * Properties files are use to extract common data.
 */
public class PropertyFileUtility {
	
	public String getDataFromProperties(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./configAppData/LoginData.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String data=pObj.getProperty(key);
		
		return data ;
	}
}
