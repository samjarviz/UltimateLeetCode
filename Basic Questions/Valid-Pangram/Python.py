class Solution:
  def checkIfPangram(self, sentence):
    alphabet = 26 * [False]
    for char in sentence:
      if char.isalpha():
        alphabet[ord(char.upper()) - ord('A')] = True
        
    return all(alphabet)
