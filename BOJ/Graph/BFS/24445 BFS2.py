from collections import deque
import sys
input=sys.stdin.readline
# 정점의 수 N 
# 간선의 수 M
# 시작 정점 R
# 간선 정보 u v




def bfs(graph,start,visited,result):
    queue=deque([start])
    visited[start]=True
    count=0
    while queue:
        v=queue.popleft()
        count+=1
        result[v]=count
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True
    return result[1:]


if  __name__=="__main__":
    N,M,R=map(int,input().split())

    visited=[False]*(N+1)

    graph=[[] for _ in range(N+1)]
    for i in range(M):
        u,v=map(int,input().split())
        graph[u].append(v)
        graph[v].append(u)
    for i in graph:
        i.sort(reverse=True)
    

    result=[0 for _ in range(N+1)]           


    answer=bfs(graph,R,visited,result)
    for i in answer:
        print(i)