package com.programs;

public class Pattern16 {

	public static void main(String[] args) {
		int row = 4;
		int clm = 4;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>i; j--)
			{
				System.out.print("- ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}


//OUTPUT
//
//- - - * 
//- - * * 
//- * * * 
//* * * * 