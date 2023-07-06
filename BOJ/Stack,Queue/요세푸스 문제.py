import sys

N,K=map(int,sys.stdin.readline().split())

circle_queue=[i+1 for i in range(N)]# 원형 큐를 만들어 준다. ( 단순 리스트를 이용한 큐 )

prior=0
result=[]
while circle_queue!=[]:
    prior+=(K-1)
    prior=prior%N
    result.append(circle_queue[prior])
    circle_queue.remove(circle_queue[prior])
    N-=1
    
print('<',end='')
print(*result,sep=', ',end='')
print('>',end='')