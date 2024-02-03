package com.programs;

public class Pattern13 {

	public static void main(String[] args) {
		int row = 4;
		int clm = 4;
		
		
		for(int i=1; i<=row; i++)
		{
			char ch = 'A';
			for(int j=1; j<=clm; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	}

}

//OUTPUT
//
//A B C D 
//A B C D 
//A B C D 
//A B C D 
