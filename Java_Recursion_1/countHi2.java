/*
Given a string, compute recursively the number of times lowercase "hi" appears in the 
string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
*/

public int countHi2(String str) {
  if (str.length() < 2) {
    return 0;
  }
  if (str.substring(0,2).equals("xh")) {
    return countHi2(str.substring(2));
  } else if (str.substring(0,2).equals("hi")) {
    return countHi2(str.substring(1)) + 1;
  } else {
    return countHi2(str.substring(1));
  }
}