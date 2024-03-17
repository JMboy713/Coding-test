from collections import deque

N=int(input())
miro = list(map(int,input().split()))
visited=[0 for i in range(N)]# 기록용
queue=deque()
queue.append(0)
count=0
while queue:
	val=queue.popleft()
	a=miro[val]
	
	for i in range(1,a+1):
		next=val+i
		if next>=N:
			continue
		if visited[val+i]==0:
			visited[val+i]=visited[val]+1
			queue.append(next)
		
if N==1:
	print(0)
elif visited[-1]==0:
	print(-1)
else:
	print(visited[-1])
			
			

