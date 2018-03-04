public boolean hasBad(String str) {
  int pos = str.indexOf("bad");
  boolean res = false;
  
  if (pos == 0 || pos == 1) {
    res = true;
  }
  
  return res;
}
