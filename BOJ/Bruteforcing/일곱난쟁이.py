# import sys
# input=sys.stdin.readline
def seven_lil(lilboy):
    max=sum(lilboy)

    for i in range(len(lilboy)):
        for j in range(i):
            if max-lilboy[i]-lilboy[j]==100:
                num1=lilboy[i]
                num2=lilboy[j]
                break
    return num1,num2

def main():
    lilboy=[]
    for i in range(9):
        lilboy.append(int(input()))
    num1,num2=seven_lil(lilboy)
    lilboy.remove(num1)
    lilboy.remove(num2)
    lilboy.sort()
    print(*lilboy)

main()