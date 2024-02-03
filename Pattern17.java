package com.programs;

public class Pattern17 {
	public static void main(String[] args) {
		int row = 5;
		int clm = 4;
		
		for(int i=1; i<=row; i++)
		{
			for(int k=1; k<i; k++)
			{
				System.out.print("- ");
			}
			for(int j=1; j<=row-i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
