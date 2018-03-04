public String firstTwo(String str) {
  if (str.length() < 3) {
    return str;
  } else {
    return str.substring(0,2);
  }
}
