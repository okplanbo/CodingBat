public boolean endsLy(String str) {
  int l = str.length();
  boolean b = false;
  
  if (l > 1 && str.substring(l-2).equals("ly")) {
    b = true;
  }
  
  return b;
}
