/*
Given a string, does "xyz" appear in the middle of the string? To define middle, 
we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/

public boolean xyzMiddle(String str) {

  if (str.length() <= 3) {
    return str.indexOf("xyz") == 0;
  }
  
  int len = str.length();
  String mid = new String();
  
  if (len % 2 == 0) {
    mid = str.substring(len / 2 - 2, len / 2 + 2);
  } else {
    mid = str.substring(len / 2 - 1, len / 2 + 2);
  }
  
  return mid.indexOf("xyz") > -1;
} 
