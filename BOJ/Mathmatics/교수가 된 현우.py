import math
import sys
input=sys.stdin.readline


T=int(input())
N=[int(input()) for _ in range(T)]

for i in N:
    five=5
    count=0
    while five<=i:
        count+=i//five
        five*=5
    print(count)

'''
6
3
60
100
1024
23456
8735373
'''