/*Problem Statement
Given an array, print the Next Greater Element (NGE) for every element.
The Next Greater Element for an element x is the first greater element
on the right side of x in the array. Elements for which no greater
element exist, consider the next greater element as -1.

Examples
Example 1:
 Input: [4, 5, 2, 25]
 Output: [5, 25, 25, -1]
Example 2:
 Input: [13, 7, 6, 12]
 Output: [-1, 12, 12, -1]*/


//-----------Solution------------------
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Solution {

    public List<Integer> nextLargerElement(List<Integer> arr) {
      //Time: O(n)
      //Space: O(n)
        int[] res = new int[arr.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.size()-1; i >= 0; i--) {
          while (!stack.isEmpty() && stack.peek() <= arr.get(i)) {
            stack.pop();
          }

          if (stack.isEmpty()) {
            res[i] = -1;
          } else {
            res[i] = stack.peek();
          }
          stack.push(arr.get(i));
        }

        //for correct output
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : res) {
          result.add(number);
        }
        return result;
    }
}
