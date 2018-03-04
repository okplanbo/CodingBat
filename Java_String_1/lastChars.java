public String lastChars(String a, String b) {
  char a1 = '@';
  char b1 = '@';
  int lena = a.length();
  int lenb = b.length();
  
  if (lena != 0) {
    a1 = a.charAt(0);
  }

  if (lenb != 0) {
    b1 = b.charAt(lenb-1);
  }
  
  return "" + a1 + b1;
}
