/*Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.

Example 1:

Input: [-2, -1, 0, 2, 3]
Output: [0, 1, 4, 4, 9]
Example 2:

Input: [-3, -1, 0, 1, 2]
Output: [0, 1, 1, 4, 9]*/

//-------------Optimized Solution--------------------
class Solution {
  public static int[] makeSquares(int[] arr) {
    //Time: O(n), touch each element once
    //Space: O(n), resulting in output array
    int highestIndex = arr.length - 1;
    int right = arr.length - 1;
    int left = 0;
    int n = arr.length;
    int[] squares = new int[n];
    
    while (left <= right) {
      int squareRight = arr[right] * arr[right];
      int squareLeft = arr[left] * arr[left];

      if (squareRight >= squareLeft) {
        squares[highestIndex] = squareRight;
        right--;
      } else { //squareLeft > squareRight
        squares[highestIndex] = squareLeft;
        left++;
      }
      highestIndex--;
    }
    return squares;
  }
}
//-------------Non-Optimized Solution--------------------
// --> fill with squares, then sort
class Solution {
  public static int[] makeSquares(int[] arr) {
    //Time: O(nlogn), sorting
    //Space: O(n), resulting in output array
    int n = arr.length;
    int[] squares = new int[n];
    int i = 0;
    for (int num : arr) {
      squares[i] = num * num;
      i++;
    }
    Arrays.sort(squares);
    return squares;
  }
}
