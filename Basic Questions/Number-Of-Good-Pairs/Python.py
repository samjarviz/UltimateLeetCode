class Solution:
  def numGoodPairs(self, nums):
    pairCount = 0
    frequency ={}
    for num in nums:
      frequency[num] = frequency.get(num, 0) + 1
      pairCount += frequency.get(num) - 1
    return pairCount