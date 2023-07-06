import sys
from math import prod
input=sys.stdin.readline

def maximum(N,tree):
    ans=[]
    for a in range(1,N):
        for b in range(a+1,N):
            for c in range(b+1,N):
                ssum=0
                ssum+=prod(tree[0:a])
                ssum+=prod(tree[a:b])
                ssum+=prod(tree[b:c])
                ssum+=prod(tree[c:N+1])
                ans.append(ssum)
    print(max(ans))

if __name__=="__main__":
    N=int(input())
    tree=list(map(int,input().split()))
    maximum(N,tree)
