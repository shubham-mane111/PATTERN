package com.programs;

public class Pattern5 {

	public static void main(String[] args) {
		int row = 3;
		int clm = 3;
		int count = 1;

      for(int i=1; i<=row; i++)
      {
    	  for(int j=1; j<=clm; j++)
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
//1 2 3 
//4 5 6 
//7 8 9 