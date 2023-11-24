from typing import List


def merge(nums1: List[int], m: int, nums2: List[int], n: int) -> None:
  mm = m + n
  for i, v in enumerate(nums2):
    nums1.insert(i + m, v)
  nums1[:] = sorted(nums1[:mm])
  print(nums1)


merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)  # output: [1,2,2,3,5,6]
merge([1], 1, [], 0)  # output: [1]
merge([0], 0, [1], 1)  # output: [1]
merge([2, 0], 2, [1], 1)  # output: [0,1,2]
merge([-1, 0, 0, 3, 3, 3, 0, 0, 0], 6, [1, 2, 2], 3)  # [-1,0,0,1,2,2,3,3,3]
