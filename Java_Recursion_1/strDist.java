/*
Given a string and a non-empty substring sub, compute recursively the largest 
substring which starts and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
*/

public int strDist(String str, String sub) {
  if (str.indexOf(sub) == 0) {
    if (str.substring(1).indexOf(sub) == -1) {
      return sub.length();
    } else {
      return strDist(str.substring(str.substring(1).indexOf(sub))+1, sub) + 
             str.substring(1).indexOf(sub) + 1;
    }
  } else {
    if (str.indexOf(sub) == -1) {
      return 0;
    } else {
      return strDist(str.substring(str.indexOf(sub)), sub);
    }
  }
}