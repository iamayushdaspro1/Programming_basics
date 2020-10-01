package challenges;

import java.util.Scanner; 

public class Hourglass_challenge {
	  
	static int findMaxSum(int [][]mat, int r, int c) 
	{ 
	    if (r < 3 || c < 3) 
	        return -1; 
	  
	    int max = Integer.MIN_VALUE; 
	    for (int i = 0; i < r - 2; i++) 
	    { 
	        for (int j = 0; j < c - 2; j++) 
	        { 
	            int current = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) + (mat[i + 1][j + 1]) + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]); 
	            max = Math.max(max, current); 
	        } 
	    } 
	    return max; 
	} 
  
    static public void main (String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number of rows = number of columns = ");
    	int r = sc.nextInt();
    	int c = r;
    	
    	System.out.println("Enter " + (r*c) + " numbers: ");
    	
    	int[][] matrix = new int[r][c];
    	
    	for(int i=0;i<r;i++) {
    		for(int j=0;j<c;j++) {
    			matrix[i][j] = sc.nextInt();
    		}
    	}
    	
        int ans = findMaxSum(matrix, r, c); 
        if (ans == -1) 
            System.out.println("There is no hour glass."); 
        else
            System.out.println("Maximum sum of hour glass in the given matrix is " + ans); 
    } 
      
} 
