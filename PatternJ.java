package com.rt;

import java.util.Scanner;

public class PatternJ {


		
		/*
	   *   
      *A*  
     *A*A* 
    *A*A*A*

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
		                if(k%2 == 0)
		                	System.out.print("A");
		                else
		              System.out.print("*");
		            
		            }
		            for(int j=i;j<n;j++)
		            {
		                System.out.print(" ");
		            }
		            
		            System.out.println();
		        }
		        
		        
		        
		        
		     }
		}

