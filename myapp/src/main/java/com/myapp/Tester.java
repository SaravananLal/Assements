package com.myapp;

import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.myapp.dto.Employee;
import com.myapp.validator.Validator;

public class Tester {
	static Log logger ;
	public static void main(String[] args) throws Exception{	
	logger	= LogFactory.getLog(Tester.class);
		try {
			Employee employee = new Employee(10," Saravanan  ",120000);
			new Validator().validate(employee);
			System.out.println("The employee details are successfully validated.");
		} 
		catch (Exception exception) {
		//	logger.error( exception.getMessage(),exception);
		//	//System.out.println(new Configurations().properties("configuration.properties").getProperty(exception.getMessage()));
	
		}
	}
}