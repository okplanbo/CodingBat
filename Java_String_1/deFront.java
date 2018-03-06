public String deFront(String str) {    
  String front = "";
  int s_len = str.length();
  
  switch (s_len) {
    case 0:   str = "";
              break;
    
    case 1:   str = str.charAt(0) == 'a' ? "a" : "";
              break;
      
    default:  front = str.charAt(0) == 'a' ? "a" : "";
              front = str.charAt(1) == 'b' ? front + 'b' : front + "";
              str = str.substring(2);
              break;
  }
   
  return front + str;
}
