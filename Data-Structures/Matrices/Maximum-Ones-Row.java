/*Problem Statement
We are given a binary matrix that has dimensions (m \times n), consisting of ones and zeros.
Our task is to determine the row that contains the highest number of ones and return two values:
the zero-based index of this row and the actual count of ones it possesses.
If there is a tie, i.e., multiple rows contain the same maximum number of ones, we must select the row with the lowest index.

Examples
Example 1:
Input: [[1, 0], [1, 1], [0, 1]]
Expected Output: [1, 2]
Justification: The second row [1, 1] contains the most ones, so the output is [1, 2].
Example 2:
Input: [[0, 1, 1], [0, 1, 1], [1, 1, 1]]
Expected Output: [2, 3]
Justification: The third row [1, 1, 1] has the most ones, leading to the output [2, 3].*/

//-------------Solution--------------------
public class Solution {
    public int[] findMaxOnesRow(int[][] mat) {
      //Time: O(n * m)
      //Space: O(1), two variables used
        int maxOnesIdx = 0;
        int maxOnesCount = 0;

        for (int row = 0; row < mat.length; row++) {
          //calc # of 1s for each row
          int currOnes = 0;
          for (int col = 0; col < mat[0].length; col++) {
            if (mat[row][col] == 1) {
              currOnes++;
            }
          }
          //update maxes if 1s count is greater
          if (currOnes > maxOnesCount) {
            maxOnesCount = currOnes;
            maxOnesIdx = row;
          }
        }
        return new int[]{maxOnesIdx, maxOnesCount};
    }
}
