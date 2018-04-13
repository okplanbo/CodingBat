/*
Given a string and a non-empty word string, return a string made of each char just 
before and just after every appearance of the word in the string. Ignore cases where 
there is no char before or after the word, and a char may be included 
twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
*/

public String wordEnds(String str, String word) {
  StringBuffer result = new StringBuffer();
  for (int i = 0; i < str.length(); i++) {
    if (str.substring(i).indexOf(word) > -1 &&
        str.substring(i, i + word.length()).equals(word)) {
      if (i > 0) {
        result.append(str.charAt(i - 1));
      }
      if (str.substring(i).length() > word.length()) {
        result.append(str.charAt(i + word.length()));
      }
    }
  }
  return result.toString();
}