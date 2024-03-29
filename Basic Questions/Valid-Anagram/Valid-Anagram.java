/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "listen", t = "silent"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Example 3:

Input: s = "hello", t = "world"
Output: false*/

//--------------------------------Solution-------------------------
import java.util.HashMap;

class Solution {
  public boolean isAnagram(String s, String t) {
    //Map the frequency of each character, both strings should be same frequency
    //Time: O(n), touch each char once
    //Space: O(1), fill map with only unique chars, max of 26
    
    //---------Edge Case----------------
    if (s.length() != t.length()) {
      return false;
    }
    //----------------------------------
    HashMap<Character,Integer> frequency = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
      frequency.put(t.charAt(i), frequency.getOrDefault(t.charAt(i), 0) - 1);
    }
    for (Integer i : frequency.values()) {
      if (i != 0) return false;
    }
    return true;
  }
}
