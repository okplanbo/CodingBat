public String atFirst(String str) {
  String res = "@@";
  int len = str.length();
  
  if (len > 0) {
    res = str.charAt(0) + "@";
  }

  if (len > 1) {
    res = str.substring(0, 2);
  }
  
  return res;
}
