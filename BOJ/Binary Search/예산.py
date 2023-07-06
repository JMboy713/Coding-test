N=int(input())
budget=list(map(int,input().split()))
M=int(input())

minV=0
maxV=max(budget)



while minV<=maxV:
    if sum(budget)<=M:
        answer=maxV
        break


    total=0
    mid=(minV+maxV)//2
    for i in budget:
        if i<=mid:
            total+=i
        else:
            total+=mid

    if total<=M:
        answer=mid
        minV=mid+1
    else:
        maxV=mid-1
    
print(answer)



