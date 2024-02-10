class Solution:
  def shortestDistance(self, words, word1, word2):
    position1 = -1
    position2 = -1
    min_distance = len(words)
    index = 0
    for word in words:
        if word == word1:
            position1 = index
        if word == word2:
           position2 = index
        if (position1 != -1 and position2 != -1):
           min_distance = min(min_distance, abs(position2 - position1))
           
        index += 1
    
    return min_distance
