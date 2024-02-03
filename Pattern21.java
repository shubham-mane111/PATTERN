package com.programs;

public class Pattern21 {

	public static void main(String[] args) {
      int row = 4;
		
		for(int i=1; i<=row; i++)
		{
			int count = 1;
			int count1 = i-1;
			for(int j=1; j<=row-i; j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++)
			{
				
				System.out.print(count+" ");
				count++;
			}
			for(int m=1; m<i; m++)
			{
				System.out.print(count1+" ");
				count1--;
			}
			System.out.println();
		}

	}

}


//OUTPUT
//
//      1 
//    1 2 1 
//  1 2 3 2 1 
//1 2 3 4 3 2 1 

