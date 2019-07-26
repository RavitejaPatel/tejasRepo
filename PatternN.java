/*
   *
  ***
 *****
*******
 *****
  ***
   *
 */





package com.rt;

import java.util.Scanner;

public class PatternN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int firstpattern=(n/2)+1;
		
		for(int i=1;i<=firstpattern;i++)
		{
			for(int j=i;j<firstpattern;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=firstpattern-1;i>=1;i--)
		{
			for(int j=1;j<=firstpattern-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
