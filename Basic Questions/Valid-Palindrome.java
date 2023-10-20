/*A phrase is a palindrome if, after converting all
uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: sentence = "A man, a plan, a canal, Panama!"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: sentence = "Was it a car or a cat I saw?"
Output: true
Explanation: Explanation: "wasitacaroracatisaw" is a palindrome.*/

//-------------Solution--------------------
// --> Best approach with two pointers and just check each when they reach valid char
// --> Non optimal below, best space complexity is O(1)
class Solution {
  public boolean isPalindrome(String s) {
    //Use SB to get correct format of string (could use split())
    //Time: O(n), have to touch every element twice
    //Space: O(n), where n is recursive calls
    StringBuilder newString = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (Character.isLetter(c)) {
        newString.append(Character.toLowerCase(c));
      } else if (Character.isDigit(c)) {
        newString.append(c);
      }
    }
    //Make initial recursive call
    return isPalindromeRec(newString.toString());
  }
  public boolean isPalindromeRec(String s) {
    //--Base Case----------
    if (s.length() <= 1) {
      return true;
    }
    //---Logic-------------
    if (s.charAt(s.length() - 1) != s.charAt(0)) {
      return false;
    }
    //---Recursive Case-------------
    return isPalindromeRec(s.substring(1, s.length() - 1));
  }
}
