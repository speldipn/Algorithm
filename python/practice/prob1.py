from typing import List

def twoSum(list: List[int], target: int) -> List[int]:
  print(list, target)
  for i in range(len(list)):
    diff = target - list[i]
    if(diff in list):
      return sorted([i,list.index(diff)])
  return [-1,-1]

print(twoSum([2,7,10,19], 26))
print(twoSum([2,7,8,11], 9))

hashTest = {}
hashTest[5] = 1
hashTest['name'] = 'Neo'

print("=======")
print(hashTest, len(hashTest))
print(hashTest['name'])
print(hashTest[5])

print(hashTest.get('Neo') == None)
print(hashTest.get('name') == None)