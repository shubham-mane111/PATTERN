package com.programs;

public class Pattern10 {

	public static void main(String[] args) {
		int row = 6;
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}

}


//OUTPUT
//
//1 2 3 4 5 6 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1