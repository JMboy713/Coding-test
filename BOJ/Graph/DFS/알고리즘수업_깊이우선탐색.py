N,M,R=map(int,input().split())
graph=[[] for _ in range(N+1)]
visited=["No"]*N
for i in range(M):
    a,b=map(int,input().split())
    graph[a].append(b)
for i in graph:
    i.sort()

print(graph)


def dfs(visited,graph,R):
    visited[R]="yes"
    print(R)
    for i in graph[R]:
        if visited[i]=="No":
            dfs(visited,graph,i)

print(dfs(visited,graph,R))