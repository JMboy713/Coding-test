# 토마토는 격자 모양 상자의 칸에 하나씩 넣어서 창고에 보관. 

# 잘 익은것, 안익은것 있다. 하루가 지나면 익은 토마토는 안익은 토마토를 물들인다. ( 상하좌우)
# 모두 익는데 몇일이 걸리는지 최소 일수는?

# 0 : 익지 않음, 1 : 익음 -1: 없음
# 전체 순회하면서 각 단위별로 익는데 걸리는 일수를 list에 넣는다.

# 하루의 단위가 필요하다. -> 리스트로 처리하자.
# 그중 max 값을 출력하면 모두 익는데 걸리는 시간이다.

from collections import deque



dx=[1,-1,0,0]
dy=[0,0,1,-1]

def bfs(graph,start_point): # 3,5
    queue=deque()
    for i in start_point:
        queue.append(i)
    height=len(graph)
    width=len(graph[0])
    
    while queue:
        x,y=queue.popleft()
        for i in range(4):
            nx=dx[i]+x
            ny=dy[i]+y
            if nx<0 or nx>=width or ny<0 or ny>=height or graph[ny][nx]==-1: # 갈수 없는 길일 경우 못감
                continue
            if graph[ny][nx]==0:
                graph[ny][nx]=(graph[y][x]+1)
                queue.append(((nx,ny)))
            if graph[ny][nx]>=2:
                graph[ny][nx]=min((graph[y][x]+1),graph[ny][nx])
    maxi=0
    for i in graph:
        maxi=max(maxi,max(i))

    return maxi-1


## 시작
M,N=map(int,input().split()) # M : 가로, N : 세로 (2 이상 1000 이하.)
graph=[]
visit_check=[]
for i in range(N):
    graph.append(list(map(int,input().split()))) # 그래프 완성
    


first_status=False
for i in range(N): # 세로
    for j in range(M):
        if graph[i][j]==0:
            first_status=True # 안익은게 하나라도 있다.


start_point=[]
for i in range(N): # 세로
    for j in range(M):        
        if graph[i][j]==1:
            start_point.append((j,i))

result=bfs(graph,start_point)




def final_check(first,graph,result):
    if first:
        for i in graph:
            if 0 in i:
                return(-1)
        return(result)
    else:
        return 0

print(final_check(first_status,graph,result))
    

        

