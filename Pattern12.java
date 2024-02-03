package com.programs;

public class Pattern12 {

	public static void main(String[] args) {
		int row = 4;
		int clm = 4;
		char ch = 'A';
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=clm; j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

}


//OUTPUT 
//
//A A A A 
//B B B B 
//C C C C 
//D D D D 