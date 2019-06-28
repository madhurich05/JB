public class FirstNonRepeatingCharacter {

static char firstNotRepeatingCharacter(String s) {
			HashMap<Character, Integer> lhm = new HashMap<>();
					
					for (char c: s.toCharArray()) {
						if(lhm.containsKey(c)){
							lhm.put(c, lhm.get(c)+1);
						} else {
							lhm.put(c, 1);
						}
					}
					
					for (char c: s.toCharArray()) {
						if(lhm.get(c)  == 1 )
				            return c;
					}
					return '_';
			}
      public static void main(String args[]) {
      System.out.println("firstNotRepeatingCharacter "+ firstNotRepeatingCharacter("abcdefghijklmnopqrstuvwxyziflskecznslkjfabe"));
      }
}
