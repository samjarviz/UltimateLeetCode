/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing English letters (lower or upper-case),
return true if sentence is a pangram, or false otherwise.

Note: The given sentence might contain other characters like digits or spaces,
your solution should handle these too.

Example 1:
Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
Output: true
Explanation: The sentence contains at least one occurrence of
every letter of the English alphabet either in lower or upper case.

Example 2:
Input: sentence = "This is not a pangram"
Output: false
Explanation: The sentence doesn't contain at least one
occurrence of every letter of the English alphabet.*/

//-------------Solution--------------------
// --> Can also use HashSet and add, then size should end up being 26.
class Solution {
  public boolean checkIfPangram(String sentence) {
    // Use boolean array to check if each char is encountered
    //Time: O(n), touch each element twice
    //Space: O(1), array with fixed size of 26
    
    boolean[] alphabet = new boolean[26];

    for (char c : sentence.toCharArray()) {
      if (Character.isLetter(c)) {
        alphabet[Character.toUpperCase(c) - 'A'] = true;
      }
    }

    for (boolean b : alphabet) {
      if (!b) {
        return false;
      }
    }
    return true;
  }
}
