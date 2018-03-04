public String withouEnd2(String str) {
  int l = str.length();
  
  if (l > 2) {
    return str.substring(1,l-1);
  } else {
    return "";
  }
  
}
