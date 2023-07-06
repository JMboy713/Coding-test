from collections import deque

N=int(input())
array=deque([i for i in range(N,0,-1)])

while len(array)!=1:
    array.pop()
    array.appendleft(array.pop())

print(*array)

