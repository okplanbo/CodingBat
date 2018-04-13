/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' 
and ending with 'p'. Return a string where for all such words, the middle letter is gone, 
so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
*/

public String zipZap(String str) {
  String result = "";
  
  if (str.length() < 3) {
    return str;
    
  }
  
  for (int i = 1; i < str.length() - 1; i++) {
    if (str.charAt(i - 1) != 'z' || 
        str.charAt(i + 1) != 'p') {
      result = result + str.charAt(i);
    }
  }
  
  result = str.charAt(0) + result + str.charAt(str.length()-1);
  
  return result;
}