package com.rt;

import java.util.Scanner;

public class PatternG {

	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter rows");
	int n=s.nextInt();
	
	

	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
			System.out.println(" ");
		}
		for(int k=0;k<i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}

}
