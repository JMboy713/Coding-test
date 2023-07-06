from collections import deque
import sys
input=sys.stdin.readline

def main():
    N=int(input())
    arr=sorted(map(int,input().split()))
    # case를 2개로 나누자. 
    case=[]
    case.append(case1(arr))
    case.append(case2(arr))
    print(max(case))


# case 1 작은게 먼저 올때 
def case1(arr):
    arr=deque(arr)
    arr2=deque()
    while arr!=deque():
        if len(arr)==1: # 1개남았을때 
            arr2.appendleft(arr.pop())
        else: # 2개 남았을 때 
            arr2.append(arr.pop())
            if arr==[]:
                break
            elif len(arr)==1:
                arr2.appendleft(arr.pop())
            else:
                arr2.append(arr.popleft())
    answer=0
    for i in range(len(arr2)-1):
        answer+=abs(arr2[i]-arr2[i+1])
    return answer

# 큰게 먼저 올때 
def case2(arr):
    arr=deque(arr)
    arr2=deque()
    while arr!=deque():
        if len(arr)==1: # 1개남았을때 
            arr2.appendleft(arr.pop())
        else: # 2개 남았을 때 
            arr2.append(arr.popleft())
            if arr==[]:
                break
            elif len(arr)==1:
                arr2.appendleft(arr.pop())
            else:
                arr2.append(arr.pop())
    answer=0
    for i in range(len(arr2)-1):
        answer+=abs(arr2[i]-arr2[i+1])
    return (answer)

if __name__=="__main__":
    main()
    

'''
6
2 -4 -4 0 1 4 

29

4
-1 -5 2 1 

16


'''