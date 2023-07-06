import sys

def movie_name(N):
    num=665
    count=0
    while True:
        num+=1
        if '666' in str(num):
            count+=1
        if count==N:
            break
    return num
    
def main():
    N=int(sys.stdin.readline())
    result=movie_name(N)
    print(result)

if __name__=="__main__":
    main()