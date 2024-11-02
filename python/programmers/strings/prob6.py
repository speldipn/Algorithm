def solution(A, B):
    print(A, B)
    for i in (range(len(A))):
        a = A[:len(A)-i]
        b = A[len(a):]
        c = b + a
        if c == B:
          return i 

    return -1

print("answer:", solution("hello", "ohell") == 1)
print("answer:", solution("apple", "elppa") == -1)
print("answer:", solution("atat", "tata") == 1)
print("answer:", solution("abc", "abc") == 0)