public String seeColor(String str) {
  String result = "";
  
  if (str.indexOf("red") == 0) {
    result = "red";
  } else if (str.indexOf("blue") == 0) {
    result = "blue";
  }
  
  return result;
}
