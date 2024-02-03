package com.programs;

public class Pattern8 {

	public static void main(String[] args) {
		int row =4;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}


//OUTPUT
//
//1 
//2 2 
//3 3 3 
//4 4 4 4 