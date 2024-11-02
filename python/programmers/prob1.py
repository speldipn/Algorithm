def solution(babbling):
    answer = 0
    pron = ["aya", "ye", "woo", "ma"]
    for word in babbling:
        target = word
        for p in pron:
            if p in target:
                target = target.replace(p, "0")
        isOk = True
        for t in target:
            if not t == '0':
                isOk = False
                break
        if isOk:
            answer += 1

    return answer

print(solution(["aya", "yee", "u", "maa", "wyeoo"]))
print(solution(["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]))