package com.programs;

public class Pattern22 {

	public static void main(String[] args) {
		int row = 4;
		int clm = 4;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=clm; j++)
			{
				
				if(i==1 || i==row || j==1 || j==clm)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}


//OUTPUT
//
//* * * * 
//*     * 
//*     * 
//* * * * 