def return_binary(N):
    return (bin(N)[2:])

def count_one(n):
    count=0
    for i in n:
        if i=='1':
            count+=1
    return count
            



def solution(n):
    num1=count_one(return_binary(n))
    bigger=(n+1)
    while True:
        if count_one(return_binary(bigger))==num1:
            return bigger
        else:
            bigger+=1

