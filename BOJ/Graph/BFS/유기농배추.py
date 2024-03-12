# 고랭지 배추를 재배.  해충으로부터 보호하는것이 중요.
# 지렁이 -> 해충을 잡아먹음. 총 배추 단위가 몇개 인지 나타내시오.
# 2차원 배열을 순회하면서 몇개인지 확인.

# 0 - 노배추 1- 배추.
from collections import deque

T: int=int(input())
# M : 가로 , N :세로 K : 배추의 개수

dx=[1,-1,0,0]
dy=[0,0,1,-1]

def bfs(graph,a,b): # 그래프, 세로, 가로
    height=len(graph)
    width=len(graph[0])
    queue=deque()
    queue.append((a,b))
    graph[a][b]=0

    while queue:
        x,y=queue.popleft() # 세로 가로
        for i in range(4):
            nx=x+dx[i] # 세로
            ny=y+dy[i] # 가로 
            if nx<0 or nx>=height or ny<0 or ny>=width:
                continue
            if graph[nx][ny]==1:
                graph[nx][ny]=0
                queue.append((nx,ny))
    






result=[]
# M : 가로 , N :세로 K : 배추의 개수
for _ in range(T):
    M,N,K=map(int,input().split())
    graph=[[0 for _ in range(M)] for _ in range(N)]
    for i in range(K):
        x,y = map(int,input().split())
        graph[y][x]=1
    count=0
    

    # 그래프 완성.

    for i in range(N): # 세로가 와야함
        for j in range(M):
            if graph[i][j]==1:
                bfs(graph,i,j) 
                count+=1
    result.append(count)

for i in result:
    print(i)











