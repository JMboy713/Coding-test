A,B=map(int,input().split())

count=1

while B!=A:
    if B%2==0:
        B=int(B/2)
        count+=1
    elif str(B)[-1]=='1' and len(str(B))>=2:
        B=str(B)
        B=B[:-1]
        B=int(B)
        count+=1
    else:
        count=-1
        break

print(count)