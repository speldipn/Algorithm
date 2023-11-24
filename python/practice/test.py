#!/usr/local/bin/python3 

from typing import List

py_list_empty = []
print(py_list_empty)

py_list = [1,2,3,4,5]; print(py_list)

py_list.append(6); print(py_list) # value
py_list.extend([7, 8]); print(py_list)
py_list.insert(1, 9); print(py_list) # value with index
py_list.remove(5); print(py_list) # value
py_list.clear(); print(py_list, len(py_list))

py_list_zeros_1 = [ i for i in range(1, 11) ]
#print(py_list_zeros_1, len(py_list_zeros_1))

py_list_zeros_2 = [1] * 10
#print(py_list_zeros_2, len(py_list_zeros_2))

print(py_list_zeros_1[-1], "index:{}".format(py_list_zeros_1.index(py_list_zeros_1[-1])))

py_list = [i for i in range(1, 6)]
print(py_list, py_list[1:3])
print(py_list, py_list[:])
print(py_list, py_list[:-3])
print(py_list, py_list[::-1])

# List Testing
import array as arr

int_array = arr.array('i', [1,2,3])
print(int_array)
print(int_array[0], int_array[1], int_array[2], "len:{}".format(len(int_array)))

int_array.insert(1, 4); print(int_array)
int_array.remove(2); print(int_array)
print("Hello", end = ' ')
print("Hello")
print("Hello")

int_list = [1,2,3,4,3,6,7,4,5,10]
print(int_list, "len:{}".format(len(int_list)))

for i in int_list:
  print(i, end=' ')
print()

# array index
print("The index of 1st occurance of 3 is: ", end="")
print(int_list.index(3))

print("The index of 1st occurance of 1 is: ", end="")
print(int_list.index(1))

