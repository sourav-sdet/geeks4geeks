package com.interviews;

public class Singleton {
	 
	private static Singleton s = null;
	
	
	//Private Constructor
	private Singleton(){
		 
	}
	
	
	//Public Method
	public static Singleton generateInstance(){
		 
		if(s == null){
			s=new Singleton();
		}
			
		return s;
		
	}
	
	

}
