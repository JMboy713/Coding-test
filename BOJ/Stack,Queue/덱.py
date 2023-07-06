import sys
from collections import deque



def push_front(X): # 정수 X를 덱의 앞에 넣는다
    result.appendleft(X)

def push_back(X): # 정수 X를 덱의 뒤에 넣는다
    result.append(X)

def pop_front():#덱의 가장 앞에 있는 수를 빼고 그 수를 출력한다. 만약 덱에 정수가 없으면 -1을 출력
   if result!=deque([]):
       print(result.popleft())
   else:
       print(-1)

def pop_back():#덱의 가장 뒤에 있는 수를 빼고 그 수를 출력한다. 만약 덱에 정수가 없으면 -1을 출력
    if result!=deque([]):
       print(result.pop())
    else:
       print(-1)

def size():# 덱에 있는 정수의 갯수를 출력
    print(len(result))

def empty():#덱이 비어있으면 1, 아니면 0 출력
    print(int(result==deque([])))

def front(): #덱의 가장 앞의 정수 출력, 없으면 -1 출력
    if result!=deque([]):
       print(result[0])
    else:
       print(-1)

def back(): # 덱의 가장 뒤에 있는 정수를 출력. 없으면 -1 출력
    if result!=deque([]):
       print(result[-1])
    else:
       print(-1)

N=int(sys.stdin.readline())
result=deque([])
for i in range(N):
    order=list(map(str,sys.stdin.readline().split()))
    if order[0]== "push_front": # 정수 X를 덱의 앞에 넣는다
        push_front(order[1])
    elif order[0]=="push_back": # 정수 X를 덱의 뒤에 넣는다
        push_back(order[1])
    elif order[0]=="pop_front":#덱의 가장 앞에 있는 수를 빼고 그 수를 출력한다. 만약 덱에 정수가 없으면 -1을 출력
        pop_front()
    elif order[0]=="pop_back":#덱의 가장 뒤에 있는 수를 빼고 그 수를 출력한다. 만약 덱에 정수가 없으면 -1을 출력
        pop_back()
    elif order[0]=="size":# 덱에 있는 정수의 갯수를 출력
        size()
    elif order[0]=="empty":#덱이 비어있으면 1, 아니면 0 출력
        empty()
    elif order[0]=="front": #덱의 가장 앞의 정수 출력, 없으면 -1 출력
        front()
    elif order[0]=="back": # 덱의 가장 뒤에 있는 정수를 출력. 없으면 -1 출력
        back()