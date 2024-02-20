class Solution:
  def isAnagram(self, s, t):
    # Check if the lengths of both strings are equal. If not, return false.
    if len(s) != len(t):
      return False

    # Create a hash map to store the frequency of characters in both strings.
    freq_map = {}
    for i in range(len(s)):
      # Increment the frequency of the character in string s.
      freq_map[s[i]] = freq_map.get(s[i], 0) + 1

      # Decrement the frequency of the character in string t.
      freq_map[t[i]] = freq_map.get(t[i], 0) - 1
      
    # Check if the frequency of all characters is 0.
    for char in freq_map:
      if freq_map[char] != 0:
        return False

    # If all characters have a frequency of 0, this means that 't' is an anagram of 's'.
    return True
