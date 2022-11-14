package com.interviews;

import java.util.ArrayList;
import java.util.List;

public class Deficient_Perfect_Abundant_Cisco {

	public static void main(String[] args) {

		int num=6;
		
		String numberType=check_Deficient_Perfect_Abundant(num);
		System.out.println(numberType);	

	}

	public static String check_Deficient_Perfect_Abundant(int num){
		
		List<Integer> divisorList=new ArrayList<>();
		
		//Find divisors of num
		for(int i=1; i<num; i++){
			if(num % i ==0)
				divisorList.add(i);
		}
		
		//Find sum of divisors of num
		int sum=0;
		for(int i=0; i<divisorList.size(); i++){
			sum=sum+divisorList.get(i);
		}
		
		//Check number type
		if(sum == num){
			return "Perfect";
		}
		
		else if(sum < num){
			return "Deficient";
		}
		
		else{
			return "Abundant";
		}
	}
	
	
	
	

}
