import sys

input=sys.stdin.readline

N,K=map(int,input().split()) # N:물건 개수 K:가방의 총량
value=[[0 for _ in range(K+1)] for _ in range(N+1)] # 물건 넣었을때 최대를 보여줄 리스트. 

# [[0, 0, 0, 0, 0, 0, 0, 0],
#  [0, 0, 0, 0, 0, 0, 0, 0],
#  [0, 0, 0, 0, 0, 0, 0, 0],
#  [0, 0, 0, 0, 0, 0, 0, 0],
#  [0, 0, 0, 0, 0, 0, 0, 0]]
item=[[0,0]] # 물건 넣을 리스트
for _ in range(N):
    wv=list(map(int,input().split()))
    item.append(wv)

#[[0, 0], [6, 13], [4, 8], [3, 6], [5, 12]]
# 타고 타고 가는 방법-> recursive 하게 만들어야함. 

for i in range(1,len(item)):
    for j in range(1,K+1):
        W=item[i][0]
        V=item[i][1]
        
        if j<W:
            value[i][j]=value[i-1][j]
        else:  # weight=6 , j= 7
            value[i][j]=max(value[i-1][j-W]+V,value[i-1][j])
print(max(value[-1]))
    


    




