import sys
from collections import deque





def bfs(graph,start,visited):
	queue=deque([start])
	visited[start]=True
	while queue:
		v=queue.popleft()
		print(v,end=' ')
		for i in graph[v]:
			if not visited[i]:
				queue.append(i)
				visited[i]=True


def dfs(graph,start,visited):
	stack=[start]
	visited[start]=True
	while stack:
		v=stack.pop()
		print(v,end=' ')
		for i in graph[v]:
			if not visited[i]:
				visited[i]=True
				dfs(graph,i,visited)
			else:
				continue


if "__main__"==__name__:
	N,M,V=map(int,sys.stdin.readline().split())
	# N :정점의 개수, M : 간선의 개수, V : 탐색 시작할 정점의 번호

	graph=[[] for _ in range(N+1)]
	
	for _ in range(M):
		src, dst = map(int, sys.stdin.readline().split())
		graph[src].append(dst)
		graph[dst].append(src)

	for x in range(1, N+1):
		graph[x] = sorted(graph[x]) # 오름차순으로 접근하기 때문에 reverse True.

	visited=[False]*(N+1)
	dfs(graph,V,visited)
	visited=[False]*(N+1)
	print()
	bfs(graph,V,visited)
