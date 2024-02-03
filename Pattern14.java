package com.programs;

public class Pattern14 {

	public static void main(String[] args) {
		int row = 3;
		int clm = 3;
		
		
		for(int i=0; i<=row; i++)
		{
			char ch = (char) ('A'+i);
			for(int j=0; j<=clm; j++)
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
//B C D E 
//C D E F 
//D E F G 