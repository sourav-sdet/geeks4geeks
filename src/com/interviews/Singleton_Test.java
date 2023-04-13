package com.interviews;

public class Singleton_Test {

	public static void main(String[] args) {

		Singleton sb1= Singleton.generateInstance();
		Singleton sb2= Singleton.generateInstance();
		Singleton sb3= Singleton.generateInstance();
		
		System.out.println("Hashcode of sb1: "+sb1.hashCode());
		System.out.println("Hashcode of sb1: "+sb2.hashCode());
		System.out.println("Hashcode of sb1: "+sb3.hashCode());
		
		if (sb1 == sb2 && sb2 == sb3) {
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        }
		
		else {
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
		

	}

}
