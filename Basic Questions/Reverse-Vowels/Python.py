
#Two pointer approach
class Solution:
  def reverseVowels(self, s: str) -> str:
    vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}

    left, right, array = 0, len(s) - 1, list(s)

    while (left < right):
      
        while (left < right and array[left] not in vowels):
            left += 1
        while (left < right and array[right] not in vowels):
            right -= 1
        #swap
        array[left], array[right] = array[right], array[left]
        left += 1
        right -= 1

    return "".join(array)