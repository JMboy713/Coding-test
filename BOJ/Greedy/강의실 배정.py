import sys
import heapq
input=sys.stdin.readline

N=int(input())
array=[]
for i in range(N):
    start,end=map(int,input().split())
    array.append([start,end])

array.sort(key=lambda x: x[0])

room =[]

heapq.heappush(room,array[0][1])

for i in range(1,N):
    if array[i][0]<room[0]: # 현재 회의실 끝나는 시간보다 다음 회의 시작 시간이 빠르면 이어서 못한다. 
        heapq.heappush(room,array[i][1])
    else: # 이어서 할 수 있다면
        heapq.heappop(room) # 새로운 회의로 시간 변경을 위해 pop 후 새 시간 push 
        heapq.heappush(room,array[i][1])

print(len(room))



'''
3
1 3
2 4
3 5

2
'''
