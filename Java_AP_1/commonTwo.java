/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. 
Return the count of the number of strings which appear in both arrays. The best "linear" solution 
makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
*/

public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int aIndex = 0;
  int bIndex = 0;
  
  while(aIndex < a.length && bIndex < b.length) {
    if (aIndex != 0 && a[aIndex].equals(a[aIndex-1])) {
      aIndex++;
      continue;
    }
    if (bIndex != 0 && b[bIndex].equals(b[bIndex-1])) {
      bIndex++;
      continue;
    }
    if (a[aIndex].compareTo(b[bIndex]) > 0) {
      bIndex++;
    } else if (a[aIndex].compareTo(b[bIndex]) < 0) {
      aIndex++;
    } else {
      count++;
      aIndex++;
      bIndex++;
    }
  }
  return count;
}