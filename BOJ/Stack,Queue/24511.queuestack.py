import sys
from collections import deque

input=sys.stdin.readline

N=int(input())
A=list(map(int,input().split())) # 0,1,1,0
B=list(map(int,input().split()))# 1,2,3,4


queuestack=[]

for idx,value in enumerate(B):
    if A[idx]==0:
        queuestack.append(deque([value]))
    else:
        queuestack.append([value])
        
M=int(input()) # 삽입할 수열의 길이. 
C=list(map(int,input().split())) # 수열의 리스트
answer=[]

for i in range(N):
	if i+1>M:
		break
	value=C[i]
	if A[i]==0:
		queuestack[i].append(value)
		value=queuestack[i].popleft()
	answer.append(value)
print(answer)
    










# for i in range(M):
# 	value=C[i]
# 	for j in range(N):
# 		if A[j]==0:
# 				queuestack[j].append(value)
# 				value=queuestack[j].popleft()
# 	answer.append(value)
# print(answer)
             
    


    
