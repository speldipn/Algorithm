from typing import List


def findPosition(nums: List[int], target: int) -> int:
  idx = 0
  for n in nums:
    if n >= target:
      idx = nums.index(n)
      break

  return idx


print(findPosition([1, 2, 3, 4, 5], 3))  # 2
print(findPosition([1, 4, 5, 6], 3))  # 1

print(10 / 3, int(10 / 3))  # 3.333...
print(10 / 4, int(10 / 4))  # 2.5
print(10 / 3.5, int(10 / 3.5))  # 2.8571...
print(type(10 / 4))  # output) float

print("============================")
print("# using binary search")


def searchInsert(nums: List[int], target: int) -> int:
  print(nums, "target:{}".format(target))
  low = 0
  high = len(nums) - 1
  while (low <= high):
    idx = int((low + high) / 2)
    if nums[idx] == target:
      return idx
    elif nums[idx] < target:
      low = idx + 1
    else:
      high = idx - 1

  return low


arr = [1, 2, 3, 4, 5]
findIdx = searchInsert(arr, 3)
arr.insert(findIdx, 3)
print(arr)

arr = [1, 4, 5, 6]
findIdx = searchInsert(arr, 3)
arr.insert(findIdx, 3)
print(arr)

arr = [1, 4, 5, 6]
findIdx = searchInsert(arr, 2)
arr.insert(findIdx, 2)
print(arr)

arr = [1, 4, 5, 6]
findIdx = searchInsert(arr, 1)
arr.insert(findIdx, 1)
print(arr)

arr = [1, 4, 5, 6]
findIdx = searchInsert(arr, 0)
arr.insert(findIdx, 0)
print(arr)

arr = [1, 4, 5, 6]
findIdx = searchInsert([1, 4, 5, 6], 7)
arr.insert(findIdx, 7)
print(arr)

arr = [1, 4, 5, 6]
findIdx = searchInsert([1, 4, 5, 6], 5)
arr.insert(findIdx, 5)
print(arr)

print("============================")
arr = [7, 3, 1]
arr1 = [2, 3, 5]
print(arr, arr1)


# call by value
def add_two(n):
  n += 2
  return n


b = 2
c = add_two(b)
print(f"b: {b} c: {c}")


# call by reference
def append_element(nums):
  # nums.append(3)
  nums[:] = [3, 4]


list_test = [2]
append_element(list_test)
print(f"{list_test} len:{len(list_test)}")

print("============================")
# NOTE: return index with value (i, v)
for i, v in enumerate([5, 2, 3]):
  print(f"[{i}]:{v}")
