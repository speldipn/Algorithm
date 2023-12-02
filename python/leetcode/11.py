from typing import List
import datetime

class Solution:
  def maxArea(self, height: List[int]) -> int:

    st = datetime.datetime.now()

    start = 0
    end = len(height) - 1
    maxArea = 0
    while start < end:
      area = (end-start) * min(height[start], height[end])
      if area > maxArea: 
        maxArea = area

      if height[start] < height[end]:
        start += 1
      else:
        end -= 1

    et = datetime.datetime.now()
    print(f"time elapsed: {int((et-st).total_seconds() * 1000)}ms")

    return maxArea

s = Solution()
print(s.maxArea([1,8,6,2,5,4,8,3,7])) # 49
print(s.maxArea([1,1])) # 1
