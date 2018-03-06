public String without2(String str) {
  int len = str.length();
  
  if (len > 1 && str.substring(0,2).equals(str.substring(len-2))) {
    str = str.substring(2);
  }
  
  return str;
}
