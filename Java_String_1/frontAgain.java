public boolean frontAgain(String str) {
  boolean result = false;
  int len = str.length();
  
  if (len > 1) {
    result = str.substring(0,2).equals(str.substring(len-2));
  }
  
  return result;
}
