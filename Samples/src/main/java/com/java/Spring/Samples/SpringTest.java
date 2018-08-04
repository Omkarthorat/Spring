package com.java.Spring.Samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		//Product product1= (Product) context.getBean("pidp");
		Product product2= (Product) context.getBean("pidc");
		
		//System.out.println(product1);
		System.out.println(product2);
		
		

	}

}

/*
*Composite object 	  ref  		auto wire=byname 		 o/p			const 
					Yes			no						okay			default
					Yes			yes						okay			default
					No			yes						okay			default
					No			No	  					okay			default

Composite Object	   ref		autowire=bytype			o/p				const
						Yes			yes					okay			default
						No			yes					okay			default
						Yes			No					okay			default

*
*
*
*
*
*
*/
