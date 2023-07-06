import sys
input=sys.stdin.readline

def main():
    N=int(input())
    muscle=list(map(int,input().split()))
    muscle.sort()
    if len(muscle)%2==0:
        answer=even_routine(muscle)
    else:
        answer=odd_routine(muscle)
    return answer

def even_routine(muscle):
    minimum=0
    while muscle!=[]:
        first=muscle.pop(0)
        last=muscle.pop()
        minimum=max(first+last,minimum)
    return minimum


def odd_routine(muscle):
    minimum=muscle.pop()
    while muscle!=[]:
        first=muscle.pop(0)
        last=muscle.pop()
        minimum=max(first+last,minimum)
    return minimum

if __name__=="__main__":
    print(main())