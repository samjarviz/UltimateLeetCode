class Solution:
  def mySqrt(self, x: int) -> int:
    if x < 2:
      return x
    
    left = 2
    right = x // 2

    while left <= right:
      middle = left + (right - left) // 2
      num = middle * middle
      if num == x:
        return middle
      if num > x:
        right = middle - 1
      if num < x:
        left = middle + 1
    return right
