/*Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums= [1, 2, 3, 4]
Output: false  
Explanation: There are no duplicates in the given array.

Example 2:
Input: nums= [1, 2, 3, 1]
Output: true  
Explanation: '1' is repeating.*/

//-------------Solution--------------------
import java.util.HashSet;
import java.util.Set;

public class Solution {

  public boolean containsDuplicate(int[] nums) {
    // HashSet to check for duplicates
    //Time: O(n), touch each element once
    //Space: O(n), Fill set with nums

    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return true;
      } else {
        set.add(num);
      }
    }
    return false;
  }
}
