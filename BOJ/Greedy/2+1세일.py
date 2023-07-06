import sys
input=sys.stdin.readline


def main():
    N=int(input())
    milk=[int(input()) for _ in range(N)]
    milk.sort(reverse=True)
    cost=0
    number=0
    for i in milk:
        number+=1
        if number==3:
            number=0
            continue
        else:
            cost+=i
    print(cost)


if __name__=="__main__":
    main()