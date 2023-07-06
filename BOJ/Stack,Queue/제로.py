import sys

K=int(sys.stdin.readline())

array=[]
for i in range(K):
    num=int(sys.stdin.readline())
    if num==0:
        array.pop()
    else:
        array.append(num)

print(sum(array))

