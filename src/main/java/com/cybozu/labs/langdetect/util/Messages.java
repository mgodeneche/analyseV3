package com.cybozu.labs.langdetect.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * This is {@link Messages} class generated by Eclipse automatically. Users don't use this class directly.
 * 
 * @author Nakatani Shuyo
 */
public class Messages {

	private static final String BUNDLE_NAME = "com.cybozu.labs.langdetect.util.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);


	private Messages() {
	}


	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		}
		catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
