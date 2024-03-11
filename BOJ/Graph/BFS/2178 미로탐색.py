import sys
from collections import deque

# input=sys.stdin.readline
N,M=map(int,input().split())

miro=[]
for i in range(N):
    miro.append(list(map(int,input())))
    

dx=[-1,1,0,0] # 좌우
dy=[0,0,-1,1] # 상하

# BFS 코드작성
def bfs(x,y):
    queue=deque()
    queue.append((x,y))
    while queue: # 큐가 빌때 까지
        x,y=queue.popleft()
        for i in range(4):
            nx=x+dx[i]# 좌우 움직여보기
            ny=y+dy[i] # 상하 움직여보기
            if nx<0 or ny<0 or nx>=N or ny>=M:
                continue
            if miro[nx][ny]==0: # 벽인 경우 무시
                continue		
            if miro[nx][ny]==1:
                miro[nx][ny]=miro[x][y]+1
                queue.append((nx,ny))
    return miro[N-1][M-1]

print(bfs(0,0))
            
    



















'''
4 6
101111
101010
101011
111011

15
'''