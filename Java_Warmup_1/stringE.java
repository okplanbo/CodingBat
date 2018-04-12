/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/	

public boolean stringE(String str) {
  int counter = 0;
  
  for (int i = str.length() - 1; i >= 0; i--) {
    if (str.charAt(i) == 'e') {
      counter++;
    }
  }
  
  return counter > 0 & counter < 4;
}