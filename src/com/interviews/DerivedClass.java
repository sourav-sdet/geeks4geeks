package com.interviews;

public class DerivedClass extends BaseClass {

	public DerivedClass(){
		System.out.println("Derived Class Constructor");
	}
	
	
	
	@Override
	public void start(){
		System.out.println("Derived Class Method");
	}
	
	
	
	public static void main(String[] args) {

		//DerivedClass dc=new DerivedClass();
		//dc.start();
		
		//BaseClass bc=new DerivedClass();
		//bc.start();
		
		
		BaseClass bc=new BaseClass();
		bc.start();
		

	}

}
