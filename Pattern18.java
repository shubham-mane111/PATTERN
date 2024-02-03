package com.programs;

public class Pattern18 {

	public static void main(String[] args) {
		int row = 4;
		int clm = 4;
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=row-i; k++)
			{
				System.out.print(i+1+" ");
			}
			System.out.println();
		}

	}

}


//OUTPUT
//
//1 1 1 1 
//  2 2 2 
//    3 3 
//      4 