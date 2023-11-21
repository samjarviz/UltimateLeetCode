/*Problem Statement
Given a square matrix (2D array), calculate the sum of its two diagonals.
The two diagonals in consideration are the primary diagonal that spans from the top-left to the bottom-right
and the secondary diagonal that spans from top-right to bottom-left. If a number is part of both diagonals
(which occurs only for odd-sized matrices), it should be counted only once in the sum.

Examples
Example 1:
Input:
[[1,2,3],
 [4,5,6],
 [7,8,9]]
Expected Output: 25
Justification: Summing up the two diagonals (1+5+9+3+7), we get 25. Please note that the element at [1][1] = 5 is counted only once.
Example 2:
Input:
[[1,0],
 [0,1]]
Expected Output: 2
Justification: The sum of the two diagonals is 1+1 = 2.*/

//-------------Solution--------------------
public class Solution {
    public static int diagonalSum(int[][] mat) {
      //Time: O(n), go through each row
      //Space: O(1), 1 variable used
        int totalSum = 0;  // Initialize the total sum
        int n = mat.length;

        for (int i = 0; i < mat.length; i++) {
          totalSum += mat[i][i] + mat[i][n - i - 1];
        }
        //edge case, if length is odd, then do not count middle element twice
        if (n % 2 != 0) {
          totalSum -= mat[n/2][n/2];
        }
        return totalSum;  // Return the calculated total sum
    }
}
