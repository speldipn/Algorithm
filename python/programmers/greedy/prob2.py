from collections import defaultdict

# def solution(n, lost, reserve):
#   users = defaultdict(int)
#   for index in range(1, n + 1): users[index] = 1;
#   for index in reserve: users[index] += 1
#   for index in lost: users[index] -= 1
#   for index in lost:
#     if users[index] != 0: continue
#     if users[index - 1] > 1:
#       users[index] += 1
#       users[index - 1] -= 1
#     elif users[index + 1] > 1:
#       users[index] += 1
#       users[index + 1] -= 1
#
#   return len([userIndex for userIndex in users if users[userIndex] > 0])

def solution(n, lost, reserve):
  print(n, lost, reserve)
  reserve, lost = set(reserve) - set(lost), set(lost) - set(reserve)

  for res in sorted(reserve):
    if res - 1 in lost:
      lost.remove(res - 1)
    elif res + 1 in lost:
      lost.remove(res + 1)

  print(lost)
  return n - len(lost)


print(solution(5, [2, 4], [1, 3, 5]))  # 5
print(solution(5, [2, 4], [3]))  # 4
print(solution(3, [3], [1]))  # 2
