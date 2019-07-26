package com.rt;

import java.util.Scanner;

public class PatternC 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		3 
        3 6 
        3 6 9
        
        3 6 9 12 
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int n=s.nextInt();
		int k=3;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int l=k*j;
				System.out.print(l+" ");
			}
		
		System.out.println();

	}
}
}

