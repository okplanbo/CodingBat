/*
Given a string, return the length of the largest "block" in the string. 
A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/

public int maxBlock(String str) {
  char temp = '0';
  int templen = 1;
  int maxlen = 0;
  
  if (str.length() == 1) {
    return 1;
  }
  
  for (int i = 1; i < str.length(); i++) {
    
    if (i == 1) {
      temp = str.charAt(0);
    }
    
    if (str.charAt(i) == temp) {
      templen++;
    } else {
      temp = str.charAt(i);
      templen = 1;
    }
    
    if (templen >= maxlen) {
      maxlen = templen;
    }
  }
  
  return maxlen;
}