import sys
from itertools import permutations
input=sys.stdin.readline



def solve(calculator,An):
    answer=[]
    for i in calculator:
        number=An[0]
        for j in range(len(i)):
            if i[j]=='+':
                number+=(An[j+1])
            elif i[j]=='-':
                number-=(An[j+1])
            elif i[j]=='*':
                number*=(An[j+1])
            else:
                number = int(number / An[j+1])
                # if number>=0:
                #     number=number//An[j+1]
                # else:
                #     number=(abs(number)//An[j+1])*(-1)
        answer.append(number)

    print(max(answer))
    print(min(answer))

if __name__=="__main__":
    N=int(input())
    An=list(map(int,input().split()))
    op_num = list(map(int, input().split()))  # +, -, *, /
    op_list = ['+', '-', '*', '/']
    op = []

    for k in range(len(op_num)):
        for i in range(op_num[k]):
            op.append(op_list[k])
    calculator=list(permutations(op,N-1))
    solve(calculator,An)


'''
3
3 4 5
1 0 1 0

35
17
'''