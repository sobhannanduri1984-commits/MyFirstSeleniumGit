package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {
	
    public static Properties props;
    
    public static void loadConfig() {
	try {
		FileInputStream fs = new FileInputStream("config.properties");
		props = new Properties();
		props.load(fs);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    
    public static String get(String key) {
    	return props.getProperty(key);
    }
}
