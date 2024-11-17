def solution(priorities, location):
  order = 0
  q = list(enumerate(priorities))
  while q:
    cur = q.pop(0)
    if any(cur[1] < p[1] for p in q):
      q.append(cur)
    else:
      order += 1
      if cur[0] == location:
        break

  return order 

# A B C D / 2,1,3,2
# B C D  A
# C D A B >>> C
# D A B / 2 2 1 >>> D
# A B / 2 1 >>> A
# B >>> B 


print(solution([2, 1, 3, 2], 2)) # 1
print(solution([1, 1, 9, 1, 1, 1], 0)) # 5