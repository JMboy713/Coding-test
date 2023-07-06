import sys
from collections import deque

input=sys.stdin.readline
case=int(input())

answer=[]

for i in range(case):
    N,M=map(int,input().split())
    importance=deque(map(int,input().split())) # 중요도
    queue=deque([j for j in range(N)]) # 리스트
    count=0
    while True:
        if queue[0]==M and importance[0]==max(importance):
            count+=1
            break
        elif importance[0]==max(importance):
            queue.popleft()
            importance.popleft()
            count+=1
        else:
            queue.append(queue.popleft())
            importance.append(importance.popleft())
     
    answer.append(count)

for i in answer:
    print(i)