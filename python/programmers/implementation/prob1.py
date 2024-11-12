def solution(rsp):
    answer = ""
    for i in range(len(rsp)):
        if rsp[i] == "2":
            answer += "0"
        elif rsp[i] == "0":
            answer += "5"
        else:
            answer += "2"

    return answer

print(solution("2")) # 0
print(solution("205")) # 052