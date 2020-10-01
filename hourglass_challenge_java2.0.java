import java.util.Scanner;

class Codechef {

	public static void main(String[] args) {
	    try
	    {
		
		Scanner in = new Scanner(System.in);
		
		int rows = 5;				
		int cols = 5;				
		int minValueInArray = -9;	
		int elementsInHourGlass = 7;
		int maxHourGlassSum = minValueInArray * elementsInHourGlass;
		int matrix[][] = new int[rows][cols];
		int hourGlassSum;	
		
		
        for(int i=0; i < rows; i++){
        	
            for(int j=0; j < cols; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i=0; i < (rows-2); i++) {
        	for (int j=0; j<(cols-2); j++) {
        		System.out.println ("Checking hourglass at (" + i + "," + j + ")");
        		System.out.println(matrix[i][j] + " " + matrix[i][j+1] + " "  + matrix[i][j+2]);
        		System.out.println("  " + matrix[i+1][j+1]);
        		System.out.println(matrix[i+2][j] + " " + matrix[i+2][j+1] + " " + matrix[i+2][j+2]);
        		hourGlassSum = matrix[i][j]   + matrix[i][j+1]   + matrix[i][j+2] +
        									    matrix[i+1][j+1] +
        					   matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
        		System.out.println("hour glass sum = " + hourGlassSum);
        		if (hourGlassSum > maxHourGlassSum) {
        			maxHourGlassSum = hourGlassSum;
        		}
        	}
        }
        System.out.println("Maximum Hour Glass Sum = " + maxHourGlassSum);

	
	    }
	    catch(Exception e)
	    {
	        return;
	    }
	    }

}