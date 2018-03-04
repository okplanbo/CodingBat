public String stringX(String str) {

  String body = "";
  String start = "";
  String end = "";
  int len = str.length();
  
  if (len > 2) {
    start = String.valueOf(str.charAt(0));
    end = String.valueOf(str.charAt(len-1));
    body = str.substring(1,len-1);
    body = body.replace("x","");
  } else {
    body = str;
  }
  
  return start + body + end;
  
}
