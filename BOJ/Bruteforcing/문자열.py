import sys
input=sys.stdin.readline

def main():
    A,B=map(str,input().split())
    if len(A)==len(B):
        ans=equal(A,B)
    else:
        ans=not_equal(A,B)
    print(ans)

def equal(A,B):
    count=0
    for i in range(len(A)):
        if A[i]!=B[i]:
            count+=1
    return count

def not_equal(A,B):
    diff=[]
    for i in range(len(B)-len(A)+1):
        count=0
        for j in range(len(A)):
            if A[j]!=B[j+i]:
                count+=1
        diff.append(count)
    return min(diff)

if __name__=="__main__":
    main()