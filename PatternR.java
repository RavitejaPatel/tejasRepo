package com.rt;

import java.util.Scanner;

public class PatternR {


public static void main(String[] args)
{
	
	    int rows, coef = 1, space, i, j;
Scanner s=new Scanner(System.in);
	    System.out.println("Enter number of rows: ");
	   rows=s.nextInt();

	    for(i=0; i<rows; i++)
	    {
	        for(space=1; space <= rows-i; space++)
	            System.out.print("  ");

	        for(j=0; j <= i; j++)
	        {
	            if (j==0 || i==0)
	                coef = 1;
	            else
	                coef = coef*(i-j+1)/j;

	            System.out.print( coef);
	        }
	        System.out.print("\n");
	    }
}
}
	    
	

