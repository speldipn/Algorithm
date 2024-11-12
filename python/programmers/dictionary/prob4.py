def solution(s):
  answer = ""
  map = {
    "zero" :"0",
    "one"  :"1",
    "two"  :"2",
    "three":"3",
    "four" :"4",
    "five" :"5",
    "six"  :"6",
    "seven":"7",
    "eight":"8",
    "nine" :"9"
  }
  i = 0
  while True:
    if s[i].isnumeric():
      answer += s[i]
      i += 1
    else:
      for key in map.keys():
        if s[i:i+len(key)] == key:
          answer += map[key]
          i += len(key)
    
    if i >= len(s):
      break

  return int(answer)

print(solution("one4seveneight")) # 1478
print(solution("23four5six7")) # 234567
print(solution("2three45sixseven")) # 234567
print(solution("123")) # 123
