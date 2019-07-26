package com.rt;

import java.util.Scanner;

public class Practical {


		
		/*
		 *     
	    ***    
	   *****   
	  *******  
	 ********* 
	***********

		 */
		

		    public static void main(String args[])
		    {
		        //Scanner s=new Scanner(System.in);
		        //int n=s.nextInt();
		Scanner s=new Scanner(System.in);
	int n=s.nextInt();	        
		        for(int i=1;i<=n;i++)
		        {
		            for(int j=i;j<n;j++)
		            {
		                System.out.print(" ");
		            }
		            for(int k=1;k<=(i*2)-1;k++)
		            {
		                System.out.print("*");
		            }
//		            for(int j=i;j<n;j++)
//		            {
//		                System.out.print(" ");
//		            }
		            
		            System.out.println();
		        }
		        
		        
		        
		        
		     }
		}


