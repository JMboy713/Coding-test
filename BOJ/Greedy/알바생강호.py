import sys
input=sys.stdin.readline

def main():
    N=int(input())
    tips=[int(input()) for _ in range(N)]
    tips.sort(reverse=True)
    answer=get_tip(N,tips)
    print(answer)
    
def get_tip(N,tips):
    tip=0
    for i in range(0,N):
        money=(tips[i]-i)
        if money>0:
            tip+=money
    return tip

if __name__=="__main__":
    main()
