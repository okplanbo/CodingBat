public String right2(String str) {
  int l = str.length();
  if (l == 2) {
    return str;
  }
  else {
    return str.substring(l-2) + str.substring(0,l-2);
  }
}
