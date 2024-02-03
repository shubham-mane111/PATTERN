package com.programs;

public class Pattern19 {

	public static void main(String[] args) {
		int row = 4;
		int clm = 4;
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			int count =i+1;
			for(int k=1; k<=row-i; k++)
			{
				
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}


//OUTPUT
//
//1 2 3 4 
//  2 3 4 
//    3 4 
//      4 