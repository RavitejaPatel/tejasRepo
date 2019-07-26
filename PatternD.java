package com.rt;

import java.util.Scanner;

public class PatternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 2
		 4 6
		 8 10 12
		
	    */
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int n=s.nextInt();
		
		int l=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int k=2*l;
				l++;
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
