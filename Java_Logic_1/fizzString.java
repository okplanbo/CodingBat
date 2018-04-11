/*
Given a string str, if the string starts with "f" return "Fizz". 
If the string ends with "b" return "Buzz". If both the "f" and "b" 
conditions are true, return "FizzBuzz". In all other cases, 
return the string unchanged. (See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/

public String fizzString(String str) {
  String fizz = "";
  String buzz = "";
  boolean fb = false;
  if (str.length() > 0 && str.charAt(0) == 'f') {
    fizz = "Fizz";
    fb = true;
  }
  if (str.length() > 0 && str.charAt(str.length()-1) == 'b') {
    buzz = "Buzz";
    fb = true;
  }
  return fb ? fizz + buzz : str;
}