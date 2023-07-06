M=int(input())
n=sorted(map(int,input().split()))
N=int(input())
m=list(map(int,input().split()))


answer=[]

for i in m:
    start=0
    end=M-1
    ans=0
    while start<=end:
        mid=(start+end)//2
        if i<n[mid]:
            end=mid-1
        elif i>n[mid]:
            start=mid+1
        else:
            ans=1 
            break
    answer.append(ans)

for i in answer:
    print(i,end='')

