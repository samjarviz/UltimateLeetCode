/*Problem Statement
Given a one-dimensional array of integers, create a new array that represents the running sum of the original array.

The running sum at position i in the new array is calculated as the sum of all the numbers in the original array
from the 0th index up to the i-th index (inclusive). Formally, the resulting array should be computed as follows:
result[i] = sum(nums[0] + nums[1] + ... + nums[i]) for each i from 0 to the length of the array minus one.

Examples
Example 1
Input: [2, 3, 5, 1, 6]
Expected Output: [2, 5, 10, 11, 17]
Justification:
For i=0: 2
For i=1: 2 + 3 = 5
For i=2: 2 + 3 + 5 = 10
For i=3: 2 + 3 + 5 + 1 = 11
For i=4: 2 + 3 + 5 + 1 + 6 = 17
Example 2
Input: [1, 1, 1, 1, 1]
Expected Output: [1, 2, 3, 4, 5]
Justification: Each element is simply the sum of all preceding elements plus the current element.*/

//-------------Solution--------------------
class Solution {
    public int[] runningSum(int[] nums) {
        //Time: O(n)
        //Space: O(n), output array used
        int[] result = new int[nums.length];
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] + runningSum;
            runningSum += nums[i];
        }
        return result;
    }
}
