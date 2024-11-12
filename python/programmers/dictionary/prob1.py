def solution(id_pw, db):
  user_id = id_pw[0]
  user_pw = id_pw[1]
  for user_db in db:
    if user_id == user_db[0]:
      if user_pw == user_db[1]:
        return "login"
      else:
        return "wrong pw"
  return "fail"

print(solution(["meosseugi", "1234"],[["rardss", "123"], ["yyoom", "1234"], ["meosseugi", "1234"]])) 
# "login"
print(solution(["programmer01", "15789"], [["programmer02", "111111"], ["programmer00", "134"], ["programmer01", "1145"]]))
# "wrong pw"
print(solution(["rabbit04", "98761"],[["jaja11", "98761"], ["krong0313", "29440"], ["rabbit00", "111333"]]))
# "fail"