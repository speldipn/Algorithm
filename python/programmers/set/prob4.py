def solution(nums):
  answer = set(nums)
  if len(answer) > len(nums) // 2:
    return len(nums) // 2
  
  return len(answer)

print(solution([3,1,2,3])) # 2
print(solution([3,3,3,2,2,4])) # 3
print(solution([3,3,3,2,2,2])) # 2