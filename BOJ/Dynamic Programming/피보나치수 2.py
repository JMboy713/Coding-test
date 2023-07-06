import sys
input=sys.stdin.readline

def pibonacchi(n):
    arr=[0 for _ in range(n+1)]
    arr[1]=1
    for i in range(len(arr)-2):
        arr[i+2]=arr[i]+arr[i+1]

    print(arr[-1])

if __name__=="__main__":
    n=int(input())
    pibonacchi(n)