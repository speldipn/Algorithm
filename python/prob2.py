from typing import List

def filter(nums: List[int]) -> List[int]:
  sortedList = sorted(nums)
  print(sortedList)
  newList = [sortedList[0]]
  for i in range(1, len(sortedList)):
    if newList[len(newList)-1] != sortedList[i]:
      newList.append(sortedList[i])

  return newList

print(filter([0,0,1,1,1,2]))
print(filter([8,8,4,4,1,1,0]))