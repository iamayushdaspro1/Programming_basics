package codejam;
/**
Problem
Vestigium means "trace" in Latin. In this problem we work with Latin squares and matrix traces.

The trace of a square matrix is the sum of the values on the main diagonal (which runs from the upper left to the lower right).

An N-by-N square matrix is a Latin square if each cell contains one of N different values, and no value is repeated within a row or a column. In this problem, we will deal only with "natural Latin squares" in which the N values are the integers between 1 and N.

Given a matrix that contains only integers between 1 and N, we want to compute its trace and check whether it is a natural Latin square. To give some additional information, instead of simply telling us whether the matrix is a natural Latin square or not, please compute the number of rows and the number of columns that contain repeated values.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each starts with a line containing a single integer N: the size of the matrix to explore. Then, N lines follow. The i-th of these lines contains N integers Mi,1, Mi,2 ..., Mi,N. Mi,j is the integer in the i-th row and j-th column of the matrix.

Output
For each test case, output one line containing Case #x: k r c, where x is the test case number (starting from 1), k is the trace of the matrix, r is the number of rows of the matrix that contain repeated elements, and c is the number of columns of the matrix that contain repeated elements.

Limits
Test set 1 (Visible Verdict)
Time limit: 20 seconds per test set.
Memory limit: 1GB.
1 ≤ T ≤ 100.
2 ≤ N ≤ 100.
1 ≤ Mi,j ≤ N, for all i, j.

Sample

Input
 	
Output
 
3
4
1 2 3 4
2 1 4 3
3 4 1 2
4 3 2 1
4
2 2 2 2
2 3 2 3
2 2 2 3
2 2 2 2
3
2 1 3
1 3 2
1 2 3

  
Case #1: 4 0 0
Case #2: 9 4 4
Case #3: 8 0 2

  
In Sample Case #1, the input is a natural Latin square, which means no row or column has repeated elements. All four values in the main diagonal are 1, and so the trace (their sum) is 4.

In Sample Case #2, all rows and columns have repeated elements. Notice that each row or column with repeated elements is counted only once regardless of the number of elements that are repeated or how often they are repeated within the row or column. In addition, notice that some integers in the range 1 through N may be absent from the input.

In Sample Case #3, the leftmost and rightmost columns have repeated elements**/


import java.util.Scanner;
class qround2020 {
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();//test cases
	        for(int i=1;i<=T;i++)
	        {
	           
	            int size=sc.nextInt();
	            int matrix[][]=new int[size][size];
	            for(int j=0;j<size;j++)
	               for(int k=0;k<size;k++)
	               matrix[j][k]=sc.nextInt();
	            int k=trace(matrix);
	            int r=rows(matrix);
	            int c=columns(matrix);
	            System.out.print("Case #"+i+": ");
	            System.out.print(k+" ");
	            System.out.print(r+" ");
	           System.out.println(c+" ");
	           
	        }
	        sc.close();
	    }
	    static int trace(int a [][])
	    {
	        int sum=0;
	        for(int i=0;i<a.length;i++)
	           for(int j=0;j< a.length;j++)
	           if(i==j)
	           sum+=a[i][j];
	           return sum;
	    }
	    static int rows(int a[][])
	    {
	    	int r=0;
	    	check:
	    	for(int i=0;i<a.length;i++)
	    	{
	    		for(int j=0;j<a.length;j++)
	    		{
	    			int c=0;
	    			int x=a[i][j];
	    					for(int k=0;k<a.length;k++)
	    					{
	    						if(x==a[i][k])
	    							c++;
	    						
	    						if(c==2)
	    						{
	    							r++;
	    							continue check;
	    						}
	    							
	    					}
	    		}
	    	}
	    	return r;
	    }
	    static int columns(int a[][])
	    {
	        int cl=0;
	         of:
	    	for(int i=0;i< a.length;i++)
	    	{
	    		
	    		for(int j=0;j<a.length;j++)
	    		{
	    		    int x=a[j][i];
	    			int c=0;
	    			for(int k=0;k<a.length;k++)
	    			{
	    				
	    				if(x==a[k][i])
	    				c++;
	    			
	    					if(c==2)
	    					{
	    						cl++;
	    						continue of;
	    					}
	    			}
	    		}
	    		
	    	}
	         return cl;
	    }
	    
}

	   



