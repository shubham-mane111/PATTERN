package com.programs;

public class Pattern15 {

	public static void main(String[] args) {
		int row = 3;
		
		
		for(int i=0; i<=row; i++)
		{
			char ch = (char) ('D'-i);
			for(int j=0; j<=i; j++)
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
//
//D 
//C D 
//B C D 
//A B C D 