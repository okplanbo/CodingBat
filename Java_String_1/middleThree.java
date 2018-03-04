public String middleThree(String str) {
  int mid = (str.length()-1) / 2;
  return str.substring(mid-1,mid+2);
}
