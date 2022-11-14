package com.interviews;

public class NumberOfCircularPrimes {

	public static void main(String[] args) {

		int num=1000;
		int count=countCircularPrimes(num);
		System.out.println(count);
		
		
	
	}

	public static int countCircularPrimes(int num) {
		
		int count=0;
		for(int i=1; i<num; i++){
			if(isCircularPrime(i)){
				count++;
			}
			
		}		
		return count;
	}

	public static boolean isCircularPrime(int n) {
		//Count Digits
		int count=0;
		int temp=n;
		while(temp > 0){
			count++;
			temp=temp/10;
		}
		
		int num=n;
		while(isPrime(num)){
			int rem=num%10;
			int div=num/10;
			
			num=(int)((Math.pow(10, count-1))*rem)+div;
			
			
			if(num==n)
				return true;
			
		}
			
		return false;
	}

	public static boolean isPrime(int n) {

		//Corner Cases
		if(n <=1)
			return false;
		if(n<=3)
			return true;
		
		if(n%2 ==0 || n%3 ==0){
			return false;
		}
		
		for(int i=5; i*i<=n; i=i+6){
			if(n % i==0 || n%(i+2) ==0)
				return false;
		}
		
		
		return true;
	}
	
}
