/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately 
to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/

// really bad description and expected results in tests. e.g., gHappy("") → true

public boolean gHappy(String str) {

  if (str.equals("g")) {
    return false;
  }
  
  if (str.length() > 1) {
    if (str.charAt(0) == 'g' && str.charAt(1) != 'g') {
      return false;
    }
    if (str.charAt(str.length()-1) == 'g' && 
        str.charAt(str.length()-2) != 'g') {
      return false;
    }
  }

  for (int i = 1; i < str.length()-1; i++) {
    if (str.charAt(i) == 'g' &&
        str.charAt(i-1) != 'g' &&
        str.charAt(i+1) != 'g') {
        return false;
    }
  }
  
  return true;
}