# 고랭지 배추를 재배.  해충으로부터 보호하는것이 중요.
# 지렁이 -> 해충을 잡아먹음. 총 배추 단위가 몇개 인지 나타내시오.
# 2차원 배열을 순회하면서 몇개인지 확인.

# 0 - 노배추 1- 배추.
from collections import deque

T: int=int(input())
# M : 가로 , N :세로 K : 배추의 개수

dx=[1,-1,0,0]
dy=[0,0,1,-1]

def dfs(graph,a,b): # 그래프, 세로, 가로
    height = len(graph)
    width = len(graph[0])
    stack =deque()
    stack.append((a,b)) # 세로 가로
    graph[a][b]=0

    while stack:
        y,x=stack.pop()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if nx<0 or nx>=width or ny < 0 or ny>=height:
                continue
            if graph[ny][nx]==1:
                graph[ny][nx]=0
                stack.append((ny,nx))




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
                dfs(graph,i,j) 
                count+=1
    result.append(count)

for i in result:
    print(i)












