def solution(survey, choices):
  scores = {"R":0, "T": 0, "C": 0, "F": 0, "J": 0, "J": 0, "M": 0, "A": 0, "N": 0}
  for i in range(len(survey)): 
    category = survey[i]
    score = choices[i]
    if score == 1: scores[category[0]] += 3
    if score == 2: scores[category[0]] += 2
    if score == 3: scores[category[0]] += 1
    if score == 5: scores[category[1]] += 1
    if score == 6: scores[category[1]] += 2
    if score == 7: scores[category[1]] += 3

  answer = ''
  if scores["R"] == scores["T"]: answer += "R"
  else: 
    if scores["R"] > scores["T"]: answer += "R"
    else: answer += "T"

  if scores["C"] == scores["F"]: answer += "C"
  else: 
    if scores["C"] > scores["F"]: answer += "C"
    else: answer += "F"

  if scores["J"] == scores["M"]: answer += "J"
  else: 
    if scores["J"] > scores["M"]: answer += "J"
    else: answer += "M"

  if scores["A"] == scores["N"]: answer += "A"
  else: 
    if scores["A"] > scores["N"]: answer += "A"
    else: answer += "N"

  return answer

print(solution(["AN", "CF", "MJ", "RT", "NA"], [5, 3, 2, 7, 5])) # "TCMA"
print(solution(["TR", "RT", "TR"], [7, 1, 3])) # "RCJA"
