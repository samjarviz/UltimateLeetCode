/*Problem Statement
Given a string, write a function that uses a stack to reverse the string.
The function should return the reversed string.

Examples
Example 1:
Input: "Hello, World!"
Output: "!dlroW ,olleH"
Example 2:
Input: "OpenAI"
Output: "IANepO"*/


//-----------Solution------------------
import java.util.Stack;

public class Solution {
    public String reverseString(String s) {
        //Time: O(2n), two loops
        //Space: O(n), fill the stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
          stack.push(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
          result.append(stack.pop());
        }
        return result.toString();
    }
}
