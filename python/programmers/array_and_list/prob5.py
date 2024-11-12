def solution(answers):
  print(answers)
  p1 = [1,2,3,4,5]
  p2 = [2,1,2,3,2,4,2,5]
  p3 = [3,3,1,1,2,2,4,4,5,5]
  corrects = [0,0,0]
  for i in range(len(answers)):
    if answers[i] == p1[i%len(p1)]: corrects[0] += 1
    if answers[i] == p2[i%len(p2)]: corrects[1] += 1
    if answers[i] == p3[i%len(p3)]: corrects[2] += 1

  a = corrects[0]
  b = corrects[1]
  c = corrects[2]
  if a > 0 and b > 0 and c > 0 and a == b and b == c and c == a:
    return [1,2,3]
  elif a > 0 and b > 0 and a == b:
    return [1,2]
  elif b > 0 and c > 0 and b == c:
    return [2,3]
  elif c > 0 and a > 0 and c == a:
    return [1,3]
  else:
    return[corrects.index(max(corrects))+1]

print(solution([1,2,3,4,5])) # [1]
print(solution([1,3,2,4,2])) # [1,2,3]