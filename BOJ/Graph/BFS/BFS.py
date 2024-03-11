from collections import deque
import sys

'''
N : 정점 , M 간선개수 R : 시작 정점
'''
	
N,M,R = map(int,sys.stdin.readline().split())

lines=[[] for _ in range(N+1)] # 정점에 대한 간선들
visited=[0] * (N+1) # 방문 여부인데 바꾸면서 방문 순서로 바꿔버림

for i in range(M):
	u,v = map(int,sys.stdin.readline().split())
	lines[u].append(v)
	lines[v].append(u)

for i in lines:
	i.sort()


def bfs(start):
	queue=deque([start])
	count=1
	visited[start]=count
	count+=1
	while queue:
		a=queue.popleft()

		for i in lines[a]:
			if visited[i]==0:
				queue.append(i)
				visited[i]=count
				count+=1

bfs(R)

for i in range(1,N+1):
	print(visited[i])



