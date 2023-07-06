import sys 
input=sys.stdin.readline

def main():
    N,M=map(int,input().split())
    J=int(input())
    apple=[int(input()) for _ in range(J)]
    left=0
    right=M
    moving=0
    move=0
    answer=apple_basket(apple,left,right,move,moving)
    print(answer)

def apple_basket(apple,left,right,move,moving):
    for i in apple:
        if i>right:
            move=i-right
            moving+=move
            left+=move
            right=i
        elif i-1<left:
            move=left-(i-1)
            moving+=move
            left=i-1
            right-=move

    return moving

if __name__=="__main__":
    main()