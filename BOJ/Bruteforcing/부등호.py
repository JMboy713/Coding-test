import sys
from itertools import permutations
input=sys.stdin.readline


def find_min(number,inequality_sign):
    for i in number:
        bool=True
        for j in range(len(i)-1):
            if inequality_sign[j]=='>' and int(i[j])<int(i[j+1]):
                bool=False
                break
            elif inequality_sign[j]=='<' and int(i[j])>int(i[j+1]):
                bool=False
                break
        if bool==True:
            return ''.join(i)
            

def find_max(number,inequality_sign):
    # 마지막 값 찾기
    for i in reversed(number):
        bool=True
        for j in range(len(i)-1):
            if inequality_sign[j]=='>' and int(i[j])<int(i[j+1]):
                bool=False
                break
            elif inequality_sign[j]=='<' and int(i[j])>int(i[j+1]):
                bool=False
                break
        if bool==True:
            return ''.join(i)
    


if __name__=="__main__":
    k=int(input())
    num=[str(i) for i in range(10)]
    inequality_sign=list(map(str,input().split()))
    number=list(permutations(num,k+1))
    maximum=find_max(number,inequality_sign)
    minimum=find_min(number,inequality_sign)
    print(maximum)
    print(minimum)