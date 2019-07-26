 package com.rt;

import java.util.Scanner;

public class PatternK {
	public static void main(String args[]) {
		// Scanner s=new Scanner(System.in);
		// int n=s.nextInt();
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
int i;
		int f = 1;
		int s=n/2+1;
	int star=n/2+2;
		
		//int temp;
		int count = n / 2 + 1;
		for ( i = 1; i <= n/2+1; i++) 
		{

			if (f == i && f <= count)
			{
				for (int j = i; j <= n / 2; j++)
				{
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i) - 1; k++)
				{
					System.out.print("*");
				}

				f = f + 1;
				System.out.println();
			}
			

			for ( i = n/2+1; i >= n; i--) 
			{
			
			if(f>count && f<=n && i>count)
			{
				
			
			for(int j=s;j<i;j++)
			{
				System.out.print(" ");
			}
			
			
			for(int k=star;k>=1;k--)
			{
				System.out.print("*");
			}
			f=f+1;
			System.out.println();
			star=star-2;
			
			}	

		}
	
	}

}
	}
 