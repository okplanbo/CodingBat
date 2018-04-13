/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. 
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests 
if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

public int sumNumbers(String str) {
  int sum = 0;
  int numstart = -1;
  boolean digits = false;
  
  for (int i = 0; i < str.length(); i++) {
    
    if (Character.isDigit(str.charAt(i)) && !digits) {
      numstart = i;
      digits = true;
      continue;
    }
    
    if (!Character.isDigit(str.charAt(i)) && digits) {
      sum += Integer.parseInt(str.substring(numstart, i));
      digits = false;
    }
    
  }
  
  if (digits) {
    sum += Integer.parseInt(str.substring(numstart));
  }
    
  return sum;
}