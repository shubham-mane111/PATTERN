package com.programs;

public class Pattern20 {

	public static void main(String[] args) {
		int row = 4;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			for(int m=1; m<i; m++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}


//OUTPUT
//
//
//     * 
//   * * * 
// * * * * * 
//* * * * * * * 