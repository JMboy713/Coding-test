N=int(input())
coin=[1,2,5,7]

a=[100001]*(N+1)

a[0]=0



for i in range(1,len(a)):
    a[i]=a[i-1]+1
    if i>=2:
        a[i]=min(a[i-2]+1,a[i])
    if i>=5:
        a[i]=min(a[i-5]+1,a[i])
    if i>=7:
        a[i]=min(a[i-7]+1,a[i])
print(a[N])
