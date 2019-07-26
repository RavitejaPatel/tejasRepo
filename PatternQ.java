/*
 
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 4 4 1
1 5 5 5 5 1
 
 
 
 */






package com.rt;

import java.util.Scanner;

public class PatternQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int temp=0;

		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
		
				for(int k=1;k<=(2*i)-1;k++)
				{
					if(k%2 == 0)
					{
						System.out.print(" ");
					}
						else if(k>1 && k<(2*i)-1)
					{
					System.out.print(temp);
					}
					else
					{
						System.out.print(1);
					}
					
					
				}
				
				System.out.println();
				temp=temp+1;
			
		}
		
		
	}

}
