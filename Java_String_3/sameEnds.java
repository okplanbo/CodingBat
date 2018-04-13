/*
Given a string, return the longest substring that appears at both the beginning and end of 
the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/

public String sameEnds(String string) {
  String result = "";
  
  for (int i = 0; i < string.length() / 2; i++) {
    if (string.substring(0, i+1).equals(string.substring(string.length()-i-1))) {
      result = string.substring(0, i+1);
    }
  }
  
  return result;
}