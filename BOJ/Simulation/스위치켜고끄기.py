import sys

def change(k):
    if switch[k]==0:
        switch[k]=1
    else:
        switch[k]=0
    return



N=int(sys.stdin.readline())
switch=[-1]+list(map(int,sys.stdin.readline().split()))

S=int(sys.stdin.readline())
for i in range(S):
    sex,num=map(int,input().split())
    if sex==1:
        for j in range(1,N+1):
            if j%num==0:
                if switch[j]==0:
                    switch[j]=1
                    
                else:
                    switch[j]=0
    else: # 여자일때 
        fwd=num
        bwd=num
        while switch[fwd]==switch[bwd] and fwd>0 and bwd<N:
            fwd-=1
            bwd+=1
            if switch[fwd]!=switch[bwd]:
                fwd+=1
                bwd-=1
                break
        for j in range(fwd,bwd+1):
            change(j)




for i in range(1, N+1):
    print(switch[i], end = " ")
    if i % 20 == 0 :
        print()

