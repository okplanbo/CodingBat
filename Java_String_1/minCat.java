public String minCat(String a, String b) {
  int len_a = a.length();
  int len_b = b.length();
  int min_l = Math.min(len_a,len_b);
  
  if (min_l > 0) {
    return a.substring(len_a - min_l) + b.substring(len_b - min_l);
  } else {
    return "";
  }
  
}
