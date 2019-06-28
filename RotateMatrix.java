public class RotateMatrix {
static int[][] rotateMatrix(int[][] a) {
    rotateTopDown(a);
    transpose(a);
    return a;
}

static void rotateTopDown(int[][] matrix)
	    {
	        for(int start = 0, end = matrix.length - 1; start < end; start++, end--)
	        {
	            int[] temp = matrix[start];
	            matrix[start] = matrix[end];
	            matrix[end] = temp;
	        }
	    }
static void transpose(int[][] matrix)
	    {
	        for(int i = 0; i < matrix.length; i++)
	        {
	            for(int j = i + 1; j < matrix[0].length; j++)
	            {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	    }
 public static void main(String args[]) {
			int[][] matrix =  {{40,12,15,37,33,11,45,13,25,3}, 
			 {37,35,15,43,23,12,22,29,46,43}, 
			 {44,19,15,12,30,2,45,7,47,6}, 
			 {48,4,40,10,16,22,18,36,27,48}, 
			 {45,17,36,28,47,46,8,4,17,3}, 
			 {14,9,33,1,6,31,7,38,25,17}, 
			 {31,9,17,11,29,42,38,10,48,6}, 
			 {12,13,42,3,47,24,28,22,3,47}, 
			 {38,23,26,3,23,27,14,40,15,22}, 
			 {8,46,20,21,35,4,36,18,32,3}};
			rotateMatrix(matrix);
			
		}
}
