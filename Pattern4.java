package com.programs;

public class Pattern4 {

	public static void main(String[] args) {
		int row = 4;
		int clm = 4;

      for(int i=1; i<=row; i++)
      {
    	  for(int j=clm; j>=1; j--)
    	  {
    		  System.out.print(j+" ");
    	  }
    	  System.out.println();
      }

	}

}


//OUTPUT
//
//4 3 2 1 
//4 3 2 1 
//4 3 2 1 
//4 3 2 1 