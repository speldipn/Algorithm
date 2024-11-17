def solution(numbers, direction):
    print(numbers)
    if direction == "left":
        return numbers[1:] + numbers[:1]
    else:
        return numbers[-1:] + numbers[0:-1]

print(solution([1, 2, 3], "right")) # [3,1,2]
print(solution([4, 455, 6, 4, -1, 45, 6], "left")) # [455,6,4,-1,45,6,4]