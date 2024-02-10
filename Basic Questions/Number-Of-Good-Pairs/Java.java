/*Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs, here are the indices: (0,3), (0,4), (3,4), (2,5).

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array is a 'good pair'.

Example 3:
Input: words = nums = [1,2,3]
Output: 0
Explanation: No number is repeating.*/

//-------------Solution--------------------
class Solution {
  public int WorseNumGoodPairs(int[] nums) {
    //Brute Force approach
    //Time: O(n^2), inner for loops
    //Space: O(1), one variable used as return value
    int pairCount = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          pairCount++;
        }
      }
    }
    return pairCount;
  }
  public int BetterNumGoodPairs(int[] nums) {
    //HashMap to store frequency
    //Time: O(n), each element touched once
    //Space: O(n), fill Hashmap with frequencies
    int pairCount = 0;
    HashMap<Integer,Integer> frequency = new HashMap<>();
    for (int num : nums) {
      frequency.put(num, frequency.getOrDefault(num, 0) + 1);
      pairCount += frequency.get(num) - 1;
    }
    return pairCount;
  }
}
