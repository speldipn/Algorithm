from typing import List


class Solution:
  def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
    p = set()
    n = set()
    z = list()
    for i in nums:
      if i > 0:
        p.add(i)
      elif i < 0:
        n.add(i)
      else:
        z.append(0)

    P = list(p)
    N = list(n)
    print(P, N, z)
    
    return []


s = Solution()
print(s.fourSum([1, 0, -1, 0, -2, 2], 0))  # [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
print(s.fourSum([2, 2, 2, 2, 2], 8))  # [[2,2,2,2]]
