/*Problem Statement
Given a positive integer n, write a function that returns its binary equivalent as a string.
The function should not use any in-built binary conversion function.

Examples
Example 1:
Input: 2
Output: "10"
Explanation: The binary equivalent of 2 is 10.
Example 2:
Input: 7
Output: "111"
Explanation: The binary equivalent of 7 is 111.*/


//-----------Solution------------------
import java.util.Stack;

public class Solution {
    public static String decimalToBinary(int num) {
        //Time: O(logn), divide by 2 in each iteration
        //Space: O(logn), total of log(n) steps, push for each step
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        //get the binary digits
        while (num > 0) {
          stack.push(num % 2);
          num /= 2;
        }

        //reverse the order
        while (!stack.isEmpty()) {
          sb.append(stack.pop());
        }

        return sb.toString();
    }
}

