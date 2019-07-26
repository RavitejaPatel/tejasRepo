package com.rt;

import java.util.Scanner;

public class PatternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1
		 2 1
		 3 2 1
		 4 3 2 1 
		 */
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		

	}

}
