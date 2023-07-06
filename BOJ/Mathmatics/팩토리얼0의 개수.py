import math
import sys

def main():
    N=int(sys.stdin.readline())
    number=str(math.factorial(N))
    factorial_zero(number)

def factorial_zero(number):
    ind=0
    for i in range(len(number)-1,-1,-1):
        if number[i]!='0':
            print(ind)
            break
        else:
            ind+=1

if __name__=="__main__":
    main()