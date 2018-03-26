package com.magg;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class App {
    public static void main( String[] args ) {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:job.xml");
		RequestGateway requestGateway = context.getBean("requestGateway", RequestGateway.class);
		Result reply = requestGateway.echo("Hello");
		System.out.println(reply);
		reply = requestGateway.echo("Hello");
		System.out.println(reply);
		context.close();
    }
}
