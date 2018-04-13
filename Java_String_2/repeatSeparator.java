/*
Given two strings, word and a separator sep, return a big string made of 
count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
*/

public String repeatSeparator(String word, String sep, int count) {
  StringBuffer result = new StringBuffer();
  if (count > 0) {
    result.append(word);
  }
  for (;count > 1; count--) {
    result.append(sep);
    result.append(word);
  }
  return result.toString();
}
