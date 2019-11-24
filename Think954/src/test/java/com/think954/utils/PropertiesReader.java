package com.think954.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.google.errorprone.annotations.DoNotCall;
import com.think954.utils.PropertiesReader;

public class PropertiesReader
{
	private static Properties properties = null;

	final static Logger logger = Logger.getLogger(PropertiesReader.class);

	private PropertiesReader() {
	}

	private static ResourceBundle rb;
	
	static {
		
		rb = ResourceBundle.getBundle("webLocator");
		logger.info("WebLocator properties loaded...");
	}

	/**
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {

		return rb.getString(key);
	}

	@DoNotCall
	public static Properties read() {
		if (Objects.nonNull(properties)) {
			return properties;

		}
		properties = new Properties();
		String root = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = root + "webLocator.properties";

		try {
			properties.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			logger.error(e.getCause());
		} catch (IOException e) {
			logger.error(e.getCause());
		}
		return properties;

	}


}
