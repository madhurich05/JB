/*
Given a string - Count Total Number of words in the string.
Note: Do Not Print Anything in your function.
Ex:
2
this is a string o/p: 4
great gambler	o/p: 2
*/
import java.util.*;
import java.math.*;

class CountWordsInString{
	int countWordsInString(String s){
      String[] arr = s.split(" ");
      int count = 0;
      for(String elem:arr){
        if(elem.trim().length() >0) 
          count++;
      }
      return count;
    	
    }
}
