import sys
from collections import deque

input=sys.stdin.readline
'''
N 자료구조 개수(~100,000)
A : 0 -> 큐 1-> 스택
B : 자료구조에 들어있는 원소 1~10억
M : 삽입할 수열의 길이 ~100000
C : 삽입할 수열. 
'''

N=int(input())
A=list(map(int,input().split())) # 0,1,1,0
B=list(map(int,input().split()))# 1,2,3,4


queuestack=deque()

for idx,value in enumerate(B):
    if A[idx]==0:
        queuestack.append(value)
        
M=int(input()) # 삽입할 수열의 길이. 
C=list(map(int,input().split())) # 수열의 리스트
answer=[]

for i in C:
    queuestack.appendleft(i)

for _ in range(M):
    answer.append(queuestack.pop()) 
print(*answer)   