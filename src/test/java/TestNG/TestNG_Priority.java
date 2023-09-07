package TestNG;

import org.testng.annotations.Test;

public class TestNG_Priority {


		//1.TestNG Main method
		
		@Test(priority=1, invocationCount=5)
		public void demo1()
		{
			System.out.println("Hi Demo 1");
		}
//2.TestNG main Method
		@Test(priority=-1, invocationCount=2)
		public void demo2()
		{
		System.out.println("HI I am Demo 2");
	}
//3.TestNG Main Method
		@Test(invocationCount=0)
		public void demo3()
		{
			System.out.println("Hi i am demo 3");
			
		}
	}
	
		
	

