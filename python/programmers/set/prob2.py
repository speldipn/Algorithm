def solution(my_string):
  _s = set()
  s = ""
  for c in my_string:
    if c not in _s: 
      _s.add(c)
      s += c

  return s

print(solution("people")) # "peol"
print(solution("We are the world")) # "We arthwold"