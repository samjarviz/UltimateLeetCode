/*Problem Statement
The task revolves around determining the richest individual from a set of bank customers. Imagine every customer has multiple bank accounts,
with each account holding a certain amount of money. The total wealth of a customer is calculated by summing all the money across their multiple accounts.

Given a 2D-array, where each sub-array represents different accounts of a customer and contains
integers representing the money in each account, find the maximum wealth among all customers.

Examples
Example 1:
Input: [[5,2,3],[0,6,7]]
Expected Output: 13
Justification: The total wealth of the first customer is 10 and of the second customer is 13. So, the output is 13 as it's the maximum among all customers.
Example 2:
Input: [[1,2],[3,4],[5,6]]
Expected Output: 11
Justification: Total wealth for each customer is [3, 7, 11]. Maximum of these is 11.*/

//-------------Solution--------------------
class Solution {
    public static int maximumWealth(int[][] accounts) {
      //Time: O(n * m), every element touched, n is rows and m is cols
      //Space: O(1), two variables used
        int maxWealth = 0;  // Initialize maxWealth to 0
        for (int i = 0; i < accounts.length; i++) {

          //calculate total wealth of each person
          int totalWealth = 0;
          for (int j = 0; j < accounts[0].length; j++) {
            totalWealth += accounts[i][j];
          }
          
          //update maxWealth
          maxWealth = Math.max(maxWealth, totalWealth);
        }
        return maxWealth;
    }
}
