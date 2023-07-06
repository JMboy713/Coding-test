from collections import deque
import sys

N=int(sys.stdin.readline())
queue=deque()

for i in range(N):
    a=sys.stdin.readline().split()
    if a[0]=="push":
        queue.append(a[1])
    if a[0]== "pop": 
        if queue!=deque():
            print(queue.popleft())
        else:
            print(-1)
    elif a[0]=="size":
        print(len(queue))
    elif a[0]=="empty":
        print(int(queue==deque([])))
    elif a[0]=="front": 
        if queue!=deque():
            print(queue[0])
        else:
            print(-1)
    elif a[0]=="back": 
        if queue!=deque():
            print(queue[-1])
        else:
            print(-1)