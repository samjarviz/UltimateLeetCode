/*Given an array of numbers sorted in ascending order and a target sum,
find a pair in the array whose sum is equal to the given target.

Write a function to return the indices of the two numbers (i.e. the pair)
such that they add up to the given target.

Example 1:
Input: [1, 2, 3, 4, 6], target=6
Output: [1, 3]
Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

Example 2:
Input: [2, 5, 9, 11], target=11
Output: [0, 2]
Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11*/

//-------------Solution--------------------
//-----Array is SORTED: Two Pointer approach:------
class Solution {
  public static int[] search(int[] arr, int targetSum) {
    //Two pointer pattern
    //Time: O(n), touch each element once
    //Space: O(1), just two variables used
    
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == targetSum) {
        return new int[] { left, right };
      } else if (sum > targetSum) {
        right--;
      } else { //sum < targetSum
        left++;
      }
    }
    return new int[] { -1, -1 };
  }
}
//---Array is NOT SORTED: HashMap:--------
class Solution {
    public int[] twoSum(int[] nums, int target) {
    //Hash map to store complements and their indexes
    //Time: O(n), touch each element once
    //Space: O(n), fill map with complements of each element
    HashMap<Integer,Integer> complementMap = new HashMap<>();
    int i = 0;
    for (int num : nums) {
      int complement = target - num;
      if (complementMap.containsKey(num)) { //pair found, return
        return new int[] { complementMap.get(num), i };
      } else {
        complementMap.put(complement, i); //add complement and its index
      }
      i++;
    }
    return new int[] { -1, -1 }; //not found at all
    }
}
