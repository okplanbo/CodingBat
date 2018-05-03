/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/

public int countHi(String str) {
  if (str.length() < 2) {
    return 0;
  }
  if (str.substring(0,2).equals("hi")) {
    return countHi(str.substring(1)) + 1;
  } else {
    return countHi(str.substring(1));
  }
}