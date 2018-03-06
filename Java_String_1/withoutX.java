public String withoutX(String str) {
  str = str.length() > 0 && str.charAt(0) == 'x' ? 
  str.substring(1) : str;
  str = str.length() > 0 && str.charAt(str.length()-1) == 'x' ? 
  str.substring(0, str.length()-1) : str;
  return str;
}
