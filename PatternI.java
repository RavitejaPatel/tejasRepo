package com.rt;

import java.util.Scanner;

public class PatternI {

	public static void main(String[] args) {

		
	/*	
		***********
		 ********* 
		  *******  
		   *****   
		    ***    
		     * 
		
		*/

	Scanner s=new Scanner(System.in);
int n=s.nextInt();	
int l=n;

for(int i=0;i<n;i++)
{
for(int j=i;j>0;j--)
{
	System.out.print(" ");
}
	
for(int k=2*l-1;k>=1;k--)
{
	System.out.print("*");
	
}
l=l-1;

//for(int j=i;j>0;j--)
//{
//	System.out.print(" ");
//}
System.out.println();

	
}
		
		

	}

}
