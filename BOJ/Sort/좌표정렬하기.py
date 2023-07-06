N=int(input())
dot=[]
for i in range(N):
    dot.append(list(map(int,input().split())))
dot.sort(key=lambda x: (x[0],x[1]))
for i in dot:
    print(i[0],i[1])