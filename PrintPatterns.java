
public class PrintPatterns {
	static void printStarRectangle(int rows, int cols) 
	{
		 //Your Code Here
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void printCountColRectangle(int rows, int cols) 
	{
		 //Your Code Here
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
		
	}
	
	static void printCountRowRectangle(int rows, int cols) {
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}
	static void printStarTriangle(int rows) 
	{
		 //Your Code Here
		for(int i=1; i<=rows;i++) {
			for(int j=1; j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		// printStarRectangle(2,2);
		// printCountColRectangle(3,4);
		// printCountRowRectangle(3,2);
		printStarTriangle(5);
		
	}
}
