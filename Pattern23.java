package com.programs;

public class Pattern23 {

	public static void main(String[] args) {
		int row=7;
		int clm = 7;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=clm; j++)
			{
				
				if(i==1 ||i==row ||j==1 ||j==clm)
				{
					System.out.print("4 ");
				}
				else if(i==2 ||i==row-1 ||j==2 ||j==clm-1)
				{
					System.out.print("3 ");
				}
				else if(i==3 ||i==row-2 ||j==3 ||j==clm-2)
				{
					System.out.print("2 ");
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

	}

}

//OUTPUT
//
//4 4 4 4 4 4 4 
//4 3 3 3 3 3 4 
//4 3 2 2 2 3 4 
//4 3 2 1 2 3 4 
//4 3 2 2 2 3 4 
//4 3 3 3 3 3 4 
//4 4 4 4 4 4 4 
