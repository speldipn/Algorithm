py_list = [1,2,3,4]
print(py_list)

s = list(enumerate(py_list))
print(s, len(s))

for n in s:
  [a,b] = n
  print(a, b, a + b)

