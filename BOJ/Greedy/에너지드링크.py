import sys
input=sys.stdin.readline

def main():
    N=int(input())
    drink=sorted(map(int,input().split()),reverse=True)
    answer=make(drink)
    print(answer)

def make(drink):
    energy_drink=drink[0]
    for i in range(1,len(drink)):
        energy_drink+=(drink[i]/2)
    return energy_drink

if __name__=="__main__":
    main()
'''
# 입력
5
3 2 10 9 6
# 20 

# 입력
10
100 9 77 65 39 27 45 1 80 495

# 716.5
'''