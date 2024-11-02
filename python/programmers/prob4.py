def solution(my_string):
    nums = []
    i = 0
    while i < len(my_string):
        j = i
        n = ""
        while j < len(my_string):
            if my_string[j].isnumeric():
                n += my_string[j]
            else:
                break
            j += 1
        i = j + 1
        if n != "": nums.append(int(n))

    answer = 0
    for n in nums:
        answer += n

    return answer

print(solution("aAb1B2cC34oOp"))
print(solution("1a2b3c4d123Z"))