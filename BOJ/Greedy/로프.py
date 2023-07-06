import sys
N=int(sys.stdin.readline())
rope=[int(sys.stdin.readline().strip())for i in range(N)]


rope.sort(reverse=True)
maxweight=(rope[-1]*N)
for i in range(N,0,-1):
    new_weight=rope[-1]*i
    if maxweight<=new_weight:
        maxweight=new_weight
    rope.pop()

print(maxweight)
