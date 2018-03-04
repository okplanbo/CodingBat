public int stringMatch(String a, String b) {
  int c = 0;
  int al = a.length();
  int bl = b.length();
  
  if ((al >= 2) && (bl >= 2)) {
    if (al > bl) {
      al = bl;
    }
    for (int i = 0; i < al-1; i++) {
      if (a.substring(i,i+2).equals(b.substring(i,i+2))) {
        c++;
      }
    }
  }
  
  return c;
  
}
