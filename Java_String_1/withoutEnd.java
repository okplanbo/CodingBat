public String withoutEnd(String str) {
  int a = str.length();
  if (a > 2) {
    return str.substring(1,a-1);
  }
  else {
    return "";
  }
}
