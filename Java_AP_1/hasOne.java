/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, 
and / to discard the rightmost digit.

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
*/

public boolean hasOne(int n) {
  while (n > 0) {
    if (n % 10 == 1) {
      return true;
    }
    n /= 10;
    if (n == 1) {
      return true;
    }
  }
  return false;
}