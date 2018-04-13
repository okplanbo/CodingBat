/*
Return a version of the given string, where for every star (*) in the string the star 
and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and 
"ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
*/

public String starOut(String str) {
  String result = "";
  
  if (str.length() < 3 && str.indexOf('*') == -1) {
    result = str;
    return result;
  }
  
  for (int i = 1; i < str.length() - 1; i++) {
    if (str.charAt(i) != '*' &
        str.charAt(i - 1) != '*' &
        str.charAt(i + 1) != '*') {
      result = result + str.charAt(i);
    }
  }
  
  if (str.charAt(0) != '*' && str.charAt(1) != '*') {
    result = str.charAt(0) + result;
  }
  
  if (str.charAt(str.length()-1) != '*' &&
      str.charAt(str.length()-2) != '*') {
    result = result + str.charAt(str.length()-1);
  }
  
  return result;
}