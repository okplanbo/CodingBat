/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced 
with "is not". The word "is" should not be immediately preceeded or followed by a letter -- 
so for example the "is" in "this" does not count. 

(Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/

public String notReplace(String str) {
  String result = "";
  int i = str.indexOf("is");
  int k = 0;
  
  while (i > -1) {
    if ((i == 0 || !Character.isLetter(str.charAt(i-1))) &&
        (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
      result = result + str.substring(k, i) + "is not";
      k = i + 2;
    }
    
    i = str.indexOf("is", i+1);
  }
  
  return result + str.substring(k);
  
}