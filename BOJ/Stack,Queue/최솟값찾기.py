# 미해결

# import heapq
import sys
input= sys.stdin.readline

N,L=map(int,input().split())
D=list(map(int,input().split()))

ans=[]

for idx,value in enumerate(D):
	if (idx+2-L)<=0:
		ans.append(min(D[:idx+1]))
	else:
		ans.append(min(D[idx+1-L:idx+1]))

print(' '.join(map(str,ans)))
	