import java.util.Stack;

public class ValidateParenthesis {
	static boolean validateParenthesis(char s[]) {
	    Stack<Character>  stk = new Stack<>();
	    for(char c:s) {
	    	if (c == '{') stk.push('{');
	    	if (c == '}' && !stk.isEmpty()) stk.pop();
	    	if (c == '[') stk.push('[');
	    	if (c == ']' && !stk.isEmpty()) stk.pop();
	    	if (c == '(') stk.push('(');
	    	if (c == ')' && !stk.isEmpty()) stk.pop();
	    }
	    
		return stk.isEmpty();

	     // Complete the code using following functions of Stack<E> class
	     // E pop()
	     // E push(E item)
	     // boolean empty()

	}
	public static void main(String args[]) {
		// System.out.println(validateParenthesis("[a+b](c-d){(){}([])}".toCharArray()));
		 System.out.println(validateParenthesis("2".toCharArray()));
	//	System.out.print(validateParenthesis(")(())(".toCharArray()));
	

	}
}
