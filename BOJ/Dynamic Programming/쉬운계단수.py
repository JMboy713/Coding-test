import sys

input=sys.stdin.readline

N=int(input())

ans=[[0]*10 for _ in range(N+1)]

ans[1]=[0,1,1,1,1,1,1,1,1,1]



for i in range(2,N+1):
	for j in range(10):
		if j==0:
			ans[i][j]=ans[i-1][j+1]
		elif j==9:
			ans[i][j]=ans[i-1][j-1]
		else:
			ans[i][j]=ans[i-1][j-1]+ans[i-1][j+1]
    
print(sum(ans[N])%1000000000)
