/*
A sandwich is two pieces of bread with something in between. Return the string 
that is between the first and last appearance of "bread" in the given string, 
or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/

public String getSandwich(String str) {
  StringBuffer result = new StringBuffer(str);
  
  if (result.indexOf("bread") > -1) {
    result.delete(0, result.indexOf("bread") + 5);
  }
  
  if (result.indexOf("bread") > -1) {
    return result.substring(0, result.lastIndexOf("bread"));
  }
  
  return "";
}