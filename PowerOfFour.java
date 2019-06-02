public class PowerOfFour {
static boolean isPowerOfFour(int n) { 
    // Your Logic Goes Here...
   // Return true when the number is a power of 2 and the remainder is 1 		when divided by 3
  	return (((n&(n-1)) == 0) && (n % 3 == 1));
}
public static void main(String args[]) {
 System.out.println(isPowerOfFour(1024));
}
}
