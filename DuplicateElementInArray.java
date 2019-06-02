public class DuplicateElementInArray {
static int findDuplicate(int arr[]) {
		  int result = arr[0];
		  for(int i=1; i<arr.length; i++){
		    result = result ^ arr[i];
		  }
		  return result;
		}
    public static void main(String args[]) {
     int[] a = {1, 2, 3, 4, 1, 2, 3, 4, 9, 2, 2};
		 System.out.println(findDuplicate(a));
	}
}
