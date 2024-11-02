def solution(s):
  results = []

  x = s[0]
  i = 0; a = 0; b = 0
  sIdx = 0
  while i < len(s):
    if x == s[i]:
      a += 1
    else:
      b += 1 

    if a == b:
      if i + 1 < len(s):
        results.append(s[sIdx:i + 1])
        x = s[i + 1]
        sIdx = i + 1
      else:
        results.append(s[sIdx:])

        a = 0; b = 0

    i += 1

  if a != b:
    results.append(s[i-1:])

  print(results)
  return len(results)

print("banana", solution("banana"), solution("banana") == 3)
print("abracadabra", solution("abracadabra"), solution("abracadabra") == 6)
print("aaabbaccccabba", solution("aaabbaccccabba"), solution("aaabbaccccabba") == 3)