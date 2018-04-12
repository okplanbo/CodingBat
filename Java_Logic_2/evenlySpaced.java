/*
Given three ints, a b c, one of them is small, one is medium and one is large. 
Return true if the three values are evenly spaced, so the difference between small 
and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public boolean evenlySpaced(int a, int b, int c) {
  if (a > b) {
    a = a + b;
    b = a - b;
    a = a - b;
  }
  if (a > c) {
    a = a + c;
    c = a - c;
    a = a - c;
    b = b + c;
    c = b - c;
    b = b - c;
  }
  if (c < b) {
    b = b + c;
    c = b - c;
    b = b - c;
  }
return c - b == b - a;
}