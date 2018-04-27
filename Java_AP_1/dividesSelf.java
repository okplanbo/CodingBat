/*
We'll say that a positive int divides itself if every digit in the number divides into the number 
evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. 
Note: use % to get the rightmost digit, and / to discard the rightmost digit.

dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
*/

public boolean dividesSelf(int n) {
  for (int i = n; i > 0; i /= 10) {
    if (i % 10 == 0 || !dividesEvenly(n, i % 10)) {
      return false;
    }
  }
  return true;
}

boolean dividesEvenly(int a, int b) {
  return (a / b) * b == a;
}