import sys
input=sys.stdin.readline

def main():
    N=int(input())
    hansu(N)

def hansu(N):
    count=N
    if N>=10:
        for i in range(10,N+1):
            string=str(i)
            d=int(string[0])-int(string[1])
            for j in range(len(string)-1):
                if d!=(int(string[j])-int(string[j+1])):
                    count-=1
                    break
        print(count)
        
    else:
        print(N)

if __name__=="__main__":
    main()