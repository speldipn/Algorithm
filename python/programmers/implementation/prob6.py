def solution(cards1, cards2, goal):
  print(goal, cards1, cards2)

  idx1, idx2 = 0, 0

  for i in range(len(goal)):
    if idx1 < len(cards1) and cards1[idx1] == goal[i]:
      idx1 += 1
    elif idx2 < len(cards2) and cards2[idx2] == goal[i]:
      idx2 += 1
    else:
      return "No"
    
  return "Yes"

# "Yes"
print(solution(["i", "drink", "water"], ["want", "to"], ["i", "want", "to", "drink", "water"]))

# "No"
print(solution(["i", "water", "drink"], ["want", "to"], ["i", "want", "to", "drink", "water"]))