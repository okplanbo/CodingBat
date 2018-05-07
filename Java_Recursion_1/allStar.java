/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/

public String allStar(String str) {
  if (str.length() < 2) {
    return str;
  }
  return str.charAt(0) + "*" + allStar(str.substring(1));
}