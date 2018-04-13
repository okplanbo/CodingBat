/*
Given two strings, base and remove, return a version of the base string where all 
instances of the remove string have been removed (not case sensitive). You may assume 
that the remove string is length 1 or more. Remove only non-overlapping instances, 
so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/

public String withoutString(String base, String remove) {
  String result = "";
  String baselow = base.toLowerCase();
  remove = remove.toLowerCase();
  
  int i = baselow.indexOf(remove);
  int j = -1;
  
  if (i > -1) { 
    result = result + base.substring (0, baselow.indexOf(remove));
  } else {
    result = result + base;
  }
  
  while (baselow.indexOf(remove, i + remove.length()) > -1) {
    j = baselow.indexOf(remove, i + remove.length());
    result = result + base.substring(i + remove.length(), j);
    i = j;
  }
  
  if (i > -1) {
    result = result + base.substring(i + remove.length());
  }
  
  return result;
}