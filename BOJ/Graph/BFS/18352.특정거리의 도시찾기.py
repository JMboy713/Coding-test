from collections import deque
import sys
input=sys.stdin.readline

#N: 도시의 개수, M=도로의 개수, K=거리정보 (최단거리),X=출발도시의 번호.
N,M,K,X=map(int,input().split())

# 그래프를 넣을 리스트
graph=[[] for _ in range(N+1)]

# 그래프 그리기
for _ in range(M):
    begin,end=map(int,input().split())
    graph[begin].append(end)

# 거리를 입력할 리스트
distance=[0 for i in range(N+1)]

# 방문여부를 입력할 리스트
visited=[False]*(N+1)

# bfs algorithm
def bfs(graph,start,visited,distance):
	queue=deque([start])
	visited[start]=True
	count=1
	while queue:
		v=queue.popleft()
		for i in graph[v]:
			if not visited[i]:
				queue.append(i)
				visited[i]=True
				distance[i]=count
				# if distance[i]==0:
				# 	distance[i]=count # 거리를 입력해준다.
		count+=1
	return distance



result=(bfs(graph,X,visited,distance))


if K in result:
	for i in range(len(result)):
		if result[i]==K:
			print(i)
else:
	print(-1)
		
