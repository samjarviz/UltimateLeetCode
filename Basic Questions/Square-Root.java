/*Given a non-negative integer x,
return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.8284,
and since we need to return the floor of the square root (integer), hence we returned 2.  

Example 2:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2.

Example 3:
Input: x = 2
Output: 1
Explanation: The square root of 2 is 1.414,
and since we need to return the floor of the square root (integer), hence we returned 1.*/

//-------------Solution--------------------
class Solution {
  public int mySqrt(int x) {
    //binary search
    //Time: 0(logn) Binary search
    //Space: O(1) only a few variables
    
    //edge case
    if (x < 2) {
      return x;
    }

    int left = 2;
    int middle;
    int right = x / 2; //the sqrt can at most be the half of a number
    long num;

    while (left <= right) {
      middle = left + (right - left) / 2; //calc middle

      num = (long) middle * middle; //logic

      if (num < x) { //update pointers
        left = middle + 1;
      } else if (num > x) {
        right = middle - 1;
      } else { //found
        return middle;
      }
    }
    return right; //return floor if between two ints
  }
}
