def solution(participant, completion):
  userMap = {}
  for i in range(len(participant)):
    key = participant[i]
    if key not in userMap:
      userMap[key] = 0
    else:
      userMap[key] = userMap[key] + 1
  
  for comp in completion:
    if userMap[comp] == 0:
      del userMap[comp]
    else: userMap[comp] -= 1

  return list(userMap.keys()).pop()

print(solution(["leo", "kiki", "eden"], ["eden", "kiki"])) # "leo"

 # "vinko"
print(solution(["marina", "josipa", "nikola", "vinko", "filipa"],	["josipa", "filipa", "marina", "nikola"]))

#"mislav"
print(solution(["mislav", "stanko", "mislav", "ana"],	["stanko", "ana", "mislav"]))