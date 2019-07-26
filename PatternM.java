package com.rt;

import java.util.Scanner;

public class PatternM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}
