/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/

public int countX(String str) {
  if (str.length() == 0) {
    return 0;
  }
  if (str.charAt(0) == 'x') {
    return countX(str.substring(1)) + 1;
  } else {
    return countX(str.substring(1));
  }
}