public String lastTwo(String str) {
  int len = str.length();
  if (len > 1) {
    return str.substring(0, len-2) + str.charAt(len-1) + str.charAt(len-2);
  } else {
    return str;
  }
}
