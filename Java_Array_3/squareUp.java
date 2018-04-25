/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : 
{0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/

public int[] squareUp(int n) {
  int[] result = new int[n*n];
  int i = n*n - 1;
  int z = n;
  
  for (int j = 1; j <= z; j++) {
    result[i] = j;
    i--;
    
    if (z == 1) {
      break;
    }
    
    if (j == z) {
      j = 0;
      i -= n - z;
      z--;
    }
  }
  
  return result;
}
