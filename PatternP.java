package com.rt;

import java.util.Scanner;

public class PatternP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();	
		int firstpattern=n/2+1;
		int limit=n;
		int temp=firstpattern;
			        for(int i=1;i<=firstpattern;i++)
			        {
			            for(int j=1;j<limit;j++)
			            {
			                System.out.print(" ");
			          
			            }
			            limit=limit-2;
			         
                       for(int k=1;k<=(2*i)-1;k++)
                         {
	                       System.out.print("*");
                         }
                          System.out.println();

			        }
			        
			        for(int i=1;i<=firstpattern-1;i++)
			        {
			        	
			        	for(int j=1;j<temp;j++)
						{
							System.out.print(" ");
						}
			        	temp=temp+2;
			        	for(int k=firstpattern;k>=(2*i)-1;k--)
			        	{
			        		System.out.print("*");
			        	}
			        	System.out.println();
			        	
			        }
			        
			        
			        
			        
			        
			        
			        }

}
