/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal 
to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/

public boolean equalIsNot(String str) {
  int count1 = 0;
  int count2 = 0;
  int i = 0;
  
  while (str.indexOf("is", i) > -1) {
    count1++;
    i = str.indexOf("is", i) + 1;
  }
  
  i = 0;
  
  while (str.indexOf("not", i) > -1) {
    count2++;
    i = str.indexOf("not", i) + 1;
  }
  
  return count1 == count2;
}