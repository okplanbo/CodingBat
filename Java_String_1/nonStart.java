public String nonStart(String a, String b) {
  if (a.length() > 1) {
    a = a.substring(1);
  }
  else {a = "";}
  
  if (b.length() > 1) {
    b = b.substring(1);
  }
  else {b = "";}
  
  return a + b;
}
