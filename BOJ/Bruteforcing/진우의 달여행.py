from copy import deepcopy

N,M=map(int,input().split()) # N이 행개수, M이 열개수

road=[list(map(int,input().split())) for i in range(N)] # 지도

fuel=[[[601 for k in range(3)] for j in range(M)] for i in range(N)] # 최단 경로 기록
fuel[0]=deepcopy(road[0]) # 출발점은 copy


# 0= left, 1=center, 2=right

for i in range(N-1):
    for j in range(M):
        # 시작점
        if i==0:
            if j==0: # 첫번째 변수일 경우 ( 왼쪽으로 못감)
                fuel[i+1][j][1]=fuel[i][j]+road[i+1][j]
                fuel[i+1][j+1][2]=fuel[i][j]+road[i+1][j+1]
                    

            elif j==(M-1): # 마지막 변수일경우 ( 오른쪽으로 못감 )
                fuel[i+1][j-1][0]=fuel[i][j]+road[i+1][j-1]
                fuel[i+1][j][1]=fuel[i][j]+road[i+1][j]

            else:
                fuel[i+1][j-1][0]=fuel[i][j]+road[i+1][j-1]
                fuel[i+1][j][1]=fuel[i][j]+road[i+1][j]
                fuel[i+1][j+1][2]=fuel[i][j]+road[i+1][j+1]

        # fuel[i][j][0]= left로 받은거 최적의 값, # fuel[i][j][1]= center로 받은거 최적의 값, # fuel[i][j][2]= right로 받은거 최적의 값, 
        else:
            # 시작점이 아닐 경우.
            if j==0: # 첫번째 변수일 경우 ( 왼쪽으로 못감)
                # 가운데로 내려가는 경우 (3번에서 받은걸로 밖에 못감.)
                fuel[i+1][j][1]=fuel[i][j][0]+road[i+1][j]
                 
                # 오른쪽으로 가는 경우. ( 중앙에서 받은거랑 왼쪽에서 받은거 ) 
                fuel[i+1][j+1][2]=min(fuel[i][j][0],fuel[i][j][1])+road[i+1][j+1]
                    
            elif j==(M-1): # 마지막 변수일경우 ( 오른쪽으로 못감 )
                # 왼쪽으로로 내려간다면 ( 중앙에서 온거 )
                fuel[i+1][j-1][0]=min(fuel[i][j][2],fuel[i][j][1])+road[i+1][j-1]

                # 중앙으로 가는 경우 ( 왼 -> 오른쪽으로 온거) 
                fuel[i+1][j][1]=fuel[i][j][2]+road[i+1][j]

            else:
                # 왼쪽으로 간다면 
                fuel[i+1][j-1][0]=min(fuel[i][j][1],fuel[i][j][2])+road[i+1][j-1]
                # 가운데로 간다면 
                fuel[i+1][j][1]=min(fuel[i][j][0],fuel[i][j][2])+road[i+1][j]
                # 오른쪽으로 간다면
                fuel[i+1][j+1][2]=min(fuel[i][j][0],fuel[i][j][1])+road[i+1][j+1]



result=601
for i in fuel[-1]:
    result=min(result,min(i))
print(result)

