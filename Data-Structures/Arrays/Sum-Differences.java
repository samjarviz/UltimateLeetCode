/*Problem Statement
The task is to find an integer array, let's call it differenceArray, of the same length as an input integer array, nums.
Each element of differenceArray, i.e., differenceArray[i], should be calculated as follows:

Take the sum of all elements to the left of index i in array nums (denoted as leftSum[i]),
and subtract it from the sum of all elements to the right of index i in array nums (denoted as rightSum[i]),
taking the absolute value of the result. Formally:

differenceArray[i] = |leftSum[i] - rightSum[i]| 
If there are no elements to the left/right of i, the corresponding sum should be taken as 0.

Examples
Example 1:
Input: [2, 5, 1, 6]
Expected Output: [12, 5, 1, 8]
Explanation:
For i=0: |(0) - (5+1+6)| = |0 - 12| = 12
For i=1: |(2) - (1+6)| = |2 - 7| = 5
For i=2: |(2+5) - (6)| = |7 - 6| = 1
For i=3: |(2+5+1) - (0)| = |8 - 0| = 8
Example 2:
Input: [3, 3, 3]
Expected Output: [6, 0, 6]
Explanation:
For i=0: |(0) - (3+3)| = 6
For i=1: |(3) - (3)| = 0
For i=2: |(3+3) - (0)| = 6*/

//-------------Solution--------------------
//-------------Optimal-Solution--------------------
public class Solution {
    public int[] findDifferenceArray(int[] nums) {
      //Time: O(3n), iterate through 3 times
      //Space: O(3n), 3 arrays used to store numbers
        int n = nums.length;
        int[] differenceArray = new int[n];
        //calculate prefix sum array
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
          prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        //calculate suffix sum array
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
          suffixSum[i] = suffixSum[i + 1] + nums[i];
        }
        //calculate diff array
        for (int i = 0; i < n; i++) {
          differenceArray[i] = Math.abs(prefixSum[i] - suffixSum[i]);
        }
        return differenceArray;
    }
}
//-------------Non-Optimal Solution--------------------
public class Solution {
    public int[] findDifferenceArray(int[] nums) {
      //Time: O(n^3)
      //Space: O(n), where n is output array
        int n = nums.length;
        int[] differenceArray = new int[n];
        
        for (int i = 0; i < nums.length; i++) {
          int leftSum = 0;
          int rightSum = 0;
          //calculate left sum
          int leftIndex = 0;
          while (leftIndex < i) {
            leftSum += nums[leftIndex];
            leftIndex++;
          }
          //calculate right sum
          int rightIndex = i + 1;
          while (rightIndex < nums.length) {
            rightSum += nums[rightIndex];
            rightIndex++;
          }
          //calculate difference
          differenceArray[i] = Math.abs(leftSum - rightSum);
        }
        return differenceArray;
    }
}
