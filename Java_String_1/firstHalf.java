public String firstHalf(String str) {
  int len = str.length();
  if (len > 0) {
   if ((len % 2) == 0) {
     return str.substring(0,len/2);
   }
   else {
     return str;
   }
  }
  else {
    return str;
  }
}
