package org.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



public class Logs4j {

	
	public static void loggs(String className, String message )
	{
		DOMConfigurator.configure("../YTFramework/logs.xml");
		Logger log = Logger.getLogger(className);
		log.info(message);
		
		
	}
	
	
	
	
}
