T=int(input())
K=[]
N=[]
for i in range(T):
    K.append(int(input()))
    N.append(int(input()))



array=[[j for j in range(max(N)+1)] for i in range(max(K)+1)]

for i in range(1,max(K)+1):
    for l in range(1,max(N)+1):
        array[i][l]=array[i][l-1]+array[i-1][l]

for i in range(T):
    k=K[i]
    n=N[i]
    print(array[k][n])

