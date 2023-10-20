/*Given an array of strings words and two different strings
that already exist in the array word1 and word2,
return the shortest distance between these two words in the list.

Example 1:
Input: words = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"], word1 = "fox", word2 = "dog"
Output: 5
Explanation: The distance between "fox" and "dog" is 5 words.

Example 2:
Input: words = ["a", "c", "d", "b", "a"], word1 = "a", word2 = "b"
Output: 1
Explanation: The shortest distance between "a" and "b" is 1 word. Please note that "a" appeared twice.*/

//-------------Solution--------------------
class Solution {
  public int shortestDistance(String[] words, String word1, String word2) {
    // Two Pointers
    //Time: O(n), iterate through array once
    //Space: O(1), only a few variables used
    int position1 = -1;
    int position2 = -1;
    int minDistance = words.length;
    String currentWord;

    for (int i = 0; i < words.length; i++) {
      currentWord = words[i];
      if (currentWord.equals(word1)) {
        position1 = i;
      } else if (currentWord.equals(word2)) {
        position2 = i;
      }
      //-----Both words found, calculate absolute distance----------
      if (position1 != -1 && position2 != -1) {
        minDistance = Math.min(minDistance, Math.abs(position2 - position1));
      }
    }
    return minDistance;
  }
}    
