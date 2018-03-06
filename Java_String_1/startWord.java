public String startWord(String str, String word) {
  int len_s = str.length();
  int len_w = word.length();
  String result = "";
  
  if (len_s > 0 && len_s >= len_w) {
    result = str.substring(1, len_w).equals(word.substring(1)) ? str.substring(0, len_w) : "";
  }
  
  return result;
}