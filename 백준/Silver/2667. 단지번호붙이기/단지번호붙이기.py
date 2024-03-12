# 단지를 정의하고, 단지에 번호를 붙힌다. 
# 단지 ( 연결되었다 ) = 좌우 아래위로 다른집이 있는 경우를 말한다. 
# 지도를 입력해서 단지수를 출력하고, 단지에 속하는 집의 수를 오름차순으로 정렬해서 출력. 
'''
input
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
output
3
7
8
9
'''

from collections import deque
import sys

dx=[0,0,1,-1]
dy=[1,-1,0,0]

def bfs(graph,a,b):
    n=len(graph) # 그래프의 길이
    stack=deque()
    stack.append((a,b)) # 큐에 시작점을 넣는다. 
    graph[a][b]=0 # 0으로 바꾼다. (방문함을 표시)
    count=1

    while stack:
        x,y= stack.pop()
        for i in range(4):
            nx= x+dx[i]
            ny=y+dy[i]
            if nx<0 or nx>=n or ny<0 or ny>=n:
                continue
            if graph[nx][ny]==1:
                graph[nx][ny]=0 # 방문으로 바꿈. 
                stack.append((nx,ny))
                count+=1
    return count
		
          
          
        
    
    
    



N=int(sys.stdin.readline())

graph = []
for i in range(N):
    graph.append(list(map(int, input())))

count=[]
for i in range(N):
    for j in range(N):
        if graph[i][j]==1:
            count.append(bfs(graph,i,j))
count.sort()
# 단지수
print(len(count))
# 오름차순으로 출력
for i in range(len(count)):
    print(count[i])




