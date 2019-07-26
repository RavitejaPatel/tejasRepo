package com.rt;

import java.util.Scanner;

public class PatternE {
	
	// TODO Auto-generated method stub
	
	/*
     *
    * *
   * * *
  * * * *
 * * * * *

	
    */
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter rows");
	int n=s.nextInt();
	
	
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(" "+"*");
		}
		System.out.println();
	}
	
	}
	
	
	

}
