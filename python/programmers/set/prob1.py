def solution(spell, dic):
    spell = set(spell)
    for word in dic: 
      if spell == set(list(word)): return 1
    return 2


print(solution(["p", "o", "s"], ["sod", "eocd", "qixm", "adio", "soo"])) # 2
print(solution(["z", "d", "x"],	["def", "dww", "dzx", "loveaw"])) # 1
print(solution(["s", "o", "m", "d"], ["moos", "dzx", "smm", "sunmmo", "som"])) # 2