# N : 행과 열의 개수,N 개의 줄을 주어서 지도 구성

from collections import deque

dx=[1,-1,0,0]
dy=[0,0,1,-1]

def main():
    N=int(input())
    graph=[]
    limit=0
    for _ in range(N):
        line=list(map(int,input().split(' ')))
        limit=max(max(line),limit)
        graph.append(line)
    
    result=[]

    # limit : 비가 올 수 있는 최대량.
    # graph : 건물
    for i in range(limit):
        visited=[[0 for _ in range(N)] for _ in range(N)]
        count=0
        for j in range(N):
            for k in range(N):
                if graph[j][k]>i and visited[j][k]==0:
                    bfs(graph,j,k,i,visited) # j 세로,k 가로
                    count+=1
        result.append(count)    
    return result

    
def bfs(graph,Y,X,limit,visited):
    width=len(graph)
    queue=deque()
    queue.append((X,Y))
    visited[Y][X]=1

    while queue:
        x,y=queue.popleft()
        for i in range(4):
            nx=dx[i]+x
            ny=dy[i]+y
            if nx<0 or nx>=width or ny<0 or ny>=width or graph[ny][nx]<=limit:
                continue
            if visited[ny][nx]==0:
                visited[ny][nx]=1
                queue.append((nx,ny))





if __name__=="__main__":
    print(max(main()))


