import copy
import sys
input = sys.stdin.readline
from itertools import permutations

num = list(range(1,10))
num = list(permutations(num, 3))    


def baseball(question):
    compare=[]
    num = list(map(str,range(1,10)))
    total = list(permutations(num, 3))  
    compare=copy.deepcopy(total)

    for i in range(question):
        num,strike,ball=map(int,input().split())
        first_num=str(num)[0]
        second_num=str(num)[1]
        last_num=str(num)[2]
        
        for j in compare:
            s=0
            b=0
            if j[0]==first_num:
                s+=1
            if j[1]==second_num:
                s+=1
            if j[2]==last_num:
                s+=1
            if j[0]==second_num or j[0]==last_num:
                b+=1
            if j[1]==first_num or j[1]==last_num:
                b+=1
            if j[2]==second_num or j[2]==first_num:
                b+=1

            if s!=strike or b!=ball:
                if j not in total:
                    continue
                total.remove(j)

    return len(total)

def main():
    question=int(input())
    answer=baseball(question)
    print(answer)


if __name__=="__main__":
    main()

'''
4
123 1 1
356 1 0
327 2 0
489 0 1
'''
