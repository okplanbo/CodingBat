public String theEnd(String str, boolean front) {
  
  if (front) {
    return "" + str.charAt(0);
  } else {
    return "" + str.charAt(str.length()-1);
  }
  
}
