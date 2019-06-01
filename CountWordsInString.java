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
