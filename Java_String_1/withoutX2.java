public String withoutX2(String str) {
  String front = "";
  
  switch (str.length()) {
    case 0:   break;

    case 1:   str = str.charAt(0) == 'x' ? "" : str;
              break;

    default:  front = str.charAt(0) == 'x' ? front : front + str.charAt(0);
              front = str.charAt(1) == 'x' ? front : front + str.charAt(1);
              str = str.substring(2);
              break;
  }
  
  return front + str;
}
