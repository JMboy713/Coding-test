# 체스판위에 나이트 -> 2칸, 1칸. 
# dx = [2,2,-2,-2,1,1,-1,-1] 
# dy = [1,-1,1,-1,2,-2,2,-2] => 8개의 움직임 모두 파악. 
# 첫째 줄 -> 체스판의 한변의 길이 I
# 체스판의 크기 i*i이다. ( 정사각형 )
# 체스판은 가로, 세로로 나타냄. 

# 두번째 줄 -> 나이트가 현재 있는 칸. 
# 세번째 줄 -> 나이트가 이동하려고 하는 칸. 

# ------
# 최소 몇번만에 이동할 수 있는지 출력. 

'''
input
3  
8 
0 0 
7 0 
100
0 0
30 50
10
1 1
1 1

output
5
28
0
'''

from collections import deque
import sys
case=int(sys.stdin.readline()) # 테스트 케이스의 수

dx = [2,2,-2,-2,1,1,-1,-1] 
dy = [1,-1,1,-1,2,-2,2,-2] 
result=[]
# bfs 
for _ in range(case):
    i=int(sys.stdin.readline()) # 변의 길이
    graph=[[0 for _ in range(i)] for _ in range(i)]
    sx,sy = map(int,sys.stdin.readline().split()) # 가로 세로
    destination_x,destination_y = map(int,sys.stdin.readline().split())
    queue=deque()
    queue.append((sx,sy))
    graph[sy][sx]=1

    while queue:
        x,y=queue.popleft()
        if x==destination_x and y==destination_y:
            break

        for j in range(8):
            nx=x+dx[j]
            ny=y+dy[j]
            if nx<0 or nx >=i or ny<0 or ny >=i: # 그래프를 넘어갈시 버린다. 
                continue
            if graph[ny][nx]==0:
                graph[ny][nx]=(graph[y][x]+1)
                queue.append((nx,ny))
            

    
    print(graph[destination_y][destination_x]-1)   


    



