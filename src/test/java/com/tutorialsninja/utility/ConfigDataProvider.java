package com.tutorialsninja.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	private static Properties pro;
	private static final String configFile="./TestData/config.properties";
	
	public static String configDataProvider(String key) {
		try {
			
			FileInputStream fis=new FileInputStream(configFile);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return pro.getProperty(key);
	}
}
