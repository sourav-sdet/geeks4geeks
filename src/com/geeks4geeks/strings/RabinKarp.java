package com.geeks4geeks.strings;

public class RabinKarp {

	public static void main(String[] args) {


		//Quadratic in worse case, but works better in general
		//Like Naive Algorithm, we slide the pattern over the text one by one
		//Compare hash values of pattern and current text window. If hash values match, then only compare
		//individual characters.
		
		//p= hash value of pattern
		//t= hash value of current window of text
		
		//Simple Hash Function- sum of individual character values
		//Problem: Spurious Hit- Hash Values match, but characters do not match
		
		//Computation of hash function will take O(m) time as it involves sum of individual character values.
		//Use Concept of Rolling Hash- Compute the next hash using previous hash in constant times
		
		
		//Rolling Hash t(i+1)= t(i)  - text(i) + text(i+m)
		//m= length of pattern
		//Computation of rolling hash is Big O(1) operation
		
		//Weighted Hash Function- Weighted sum of ASCII Values with powers of d
		//Computation of Rolling Hash for Weighted Hash Function- t(i+1)= d  (t(i) - text(i) * d^m-1) + text(i+m)
		
		String text="ABABABCABC";
		String pat="ABC";
		
		rabinKarb(text,pat, text.length(), pat.length());
		
	}

	public static void rabinKarb(String text, String pat, int n, int m) {
		
		//n= text length
		//m= pattern length
		
		//We do computations under modulo q: as the weighted sum of ASCII Values of character can be large.
		//We choose q to be a very large prime number to reduce spurious hits
		
		int h=1, d=3,q=13;
		
		//Compute Hash Function
		for(int i=1; i<=m-1; i++){
			h=(h*d) % q;
		}
		
		//Compute p and t(0)
		int p=0, t=0;
		for(int i=0; i<m; i++){
			
			p=((p*d)+pat.charAt(i)) %q;
			t=((t*d)+text.charAt(i)) %q;
		}
		
		//Check Spurious Hits
		for(int i=0; i<=n-m; i++){
			if(p==t){
				boolean flag=true;
				for(int j=0; j<m; j++){
					if(pat.charAt(j) != text.charAt(i+j)){
						flag=false;
						break;
					}
				}
				
				if(flag==true)
					System.out.print(i+" ");
			}
			
			//Compute t(i+1) based on t(i)
			if(i<n-m){
				
				t=((d*(t-text.charAt(i) * h) + text.charAt(i+m) %q));
				if(t<0)
					t=t+q;
			}
		}
			
		
	}

}

   	//Rabin Karp algorithm performs better than Naive Algo in average case.
	//It performs same as Naive Algo when text="AAAAA" and pat="AAA"
	//It is widely used in applications where there are multiple patterns to be searched in a text.
