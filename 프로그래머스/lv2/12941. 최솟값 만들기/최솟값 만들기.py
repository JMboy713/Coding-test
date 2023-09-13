def solution(A,B):
    answer = 0
    A.sort(reverse=True)
    B.sort()
    print(A,B)
    for i in range(len(A)):
        answer+=A[-1]*B[-1]
        A.pop()
        B.pop()
    return answer
    