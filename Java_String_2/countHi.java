/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/

public int countHi(String str) {
  int countHi = 0;
  for (int i = 0; i < str.length()-1; i++) {
    if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
      countHi++;
      }
    }
  return countHi;
}
