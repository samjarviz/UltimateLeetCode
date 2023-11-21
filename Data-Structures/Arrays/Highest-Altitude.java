/*You are given an array of integers representing a journey on a bike, wherein each number indicates a climb or descent in altitude, measured as a gain or loss of height.
The rider starts at altitude 0. Your task is to determine the highest altitude the biker reaches at any point during the journey.

Examples
Example 1
Input: [-5, 1, 5, 0, -7]
Expected Output: 1
Justification: The altitude changes are [-5, -4, 1, 1, -6], where 1 is the highest altitude reached.
Example 2
Input: [4, -3, 2, -1, -2]
Expected Output: 4
Justification: The altitude changes are [4, 1, 3, 2, 0], where 4 is the highest altitude reached.*/

//-------------Solution--------------------
public class Solution {
    public int largestAltitude(int[] gain) {
      //Time: O(n), iterate through array
      //Space: O(1), 2 variables used
        int maxAltitude = gain[0]; // To store the maximum altitude encountered
        int currentAltitude = gain[0];

        for (int i = 1; i < gain.length; i++) {
          currentAltitude += gain[i];
          maxAltitude = Math.max(currentAltitude, maxAltitude);
        }
        return maxAltitude;
    }
}
