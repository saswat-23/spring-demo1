package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//Java Way
//		Coach myCoach = new CricketCoach();
//		System.out.println(myCoach.getDailyWorkout());
		
		
		//Spring Way (IOC)
		//1. Create Spring Container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//2. Get bean from the container
		Coach myCoach2 = applicationContext.getBean("myCoach", Coach.class);
			
		//3. Use the bean
		System.out.println(myCoach2.getDailyWorkout()+"\n"+myCoach2.getDailyFortune());
		System.out.println("\n\nCoach details: \n"+myCoach2);
		
		//4. Close the container
		applicationContext.close();
		
	}

}
