package Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "configs//config.properties";
	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			
			properties = new Properties();
			
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Config File not found " + propertyFilePath);
		}		
	}
	
	public String getAppURL() {
		String url = properties.getProperty("appUrl");
		if(url != null) return url;
		else throw new RuntimeException("Application url is missing in Config file");
	}
	
	public int getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Integer.parseInt(implicitlyWait);
		else throw new RuntimeException("implicitlyWait is missing in config file.");	
	}
}
