import sys
input=sys.stdin.readline

def main():
    T=int(input())
    answer=interview(T)
    print(*answer)


def interview(T):
    answer=[]
    for _ in range(T):
        N=int(input())
        score=[list(map(int,input().split())) for _ in range(N)]
        score.sort(key=lambda x:x[0])
        last_rank=N+1
        employee=0
        for i in score:
            if last_rank>i[1]:
                last_rank=i[1]
                employee+=1
        answer.append(employee)
    return answer


if __name__=="__main__":
    main()



'''
#입력
2
5
3 2
1 4
4 1
2 3
5 5
7
3 6
7 3
4 2
1 4
5 7
2 5
6 1
#출력
4
3
'''