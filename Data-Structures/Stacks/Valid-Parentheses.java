/*Problem Statement
The "Balanced Parentheses" problem requires you to determine if a given string of parentheses is balanced.
A string of parentheses is considered balanced if every opening parenthesis
has a corresponding closing parenthesis in the correct order.

Example 1:
Input: String s = "{[()]}";
Expected Output: true
Explanation: The parentheses in this string are perfectly balanced. Every opening parenthesis '{', '[', '('
has a corresponding closing parenthesis '}', ']', ')' in the correct order. The stack will eventually be
empty after the complete traversal of the string, indicating the string is balanced.

Example 2:
Input: string s = "{[}]";
Expected Output: false
Explanation: The brackets are not balanced in this string. Although it contains the same number of opening
and closing brackets for each type, they are not correctly ordered. The ']' closes '[' before '{' can be
closed by '}', and similarly, '}' closes '{' before '[' can be closed by ']'. Hence, the string is not
balanced, and the function should return false.*/


//-----------Solution------------------
import java.util.Stack;
import java.util.HashMap;

public class Solution {
    public boolean isValid(String s) {
        //Time: O(n)
        //Space: O(n), fill the stack
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        char[] characters = s.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            //push everything til you hit closing brace
            if (characters[i] == ')' || characters[i] == ']' || characters[i] == '}') {
                //if braces do not match, not valid
                if (map.get(characters[i]) != stack.pop()) {
                    return false;
                }
            } else {
                stack.push(characters[i]);
            }
        }
        //stack should be empty --> meaning equal # of open and closed braces
        return stack.isEmpty();
    }
}
