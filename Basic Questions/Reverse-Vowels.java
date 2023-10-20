/*Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u',
and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s= "hello"
Output: "holle"

Example 2:
Input: s= "AEIOU"
Output: "UOIEA"*/

//-------------Solution--------------------
// --> Not the absolute best, could use two pointers and then swap each vowel
// Complexities are still the same
public class Solution {
  public String reverseVowels(String s) {
    //Set of vowels to check for each letter
    //Stack to keep track of indexes of each vowel
    //SB to put vowels in reversed order
    //Time: O(n), touch each element of s once
    //Space: O(n), fill stack and sb with each vowel and values
    HashSet<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');

    StringBuilder reversedVowels = new StringBuilder();
    Stack<Integer> indexes = new Stack<>();

    for (int i = s.length() - 1; i >= 0; i--) {
      if (vowels.contains(Character.toLowerCase(s.charAt(i)))) {
        reversedVowels.append(s.charAt(i));
        indexes.push(i);
      }
    }
    String reverseVowel = reversedVowels.toString();
    char[] charArray = s.toCharArray();
    int j = 0;
    while (!indexes.isEmpty()) {
      int index = indexes.pop();
      charArray[index] = reverseVowel.charAt(j);
      j++;
    }

    return new String(charArray);
  }
}
