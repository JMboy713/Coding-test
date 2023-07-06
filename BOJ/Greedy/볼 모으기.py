N=int(input())
balls=input()
array=[]


for i in balls:
    array.append(i)
Rset=set(array)

if Rset=={'R'} or Rset=={'B'}:
    print(0)
else:
    LastBlue=balls.rfind('B')+1
    LastRed=balls.rfind('R')+1
    FirstBlue=array.index('B')+1
    FirstRed=array.index('R')+1

    # print(LastBlue,LastRed,FirstBlue,FirstRed)

    rightRedball=0
    rightBlueball=0
    leftRedball=0
    leftBlueball=0


    sarray=sorted(array)
    reversearray=sorted(array,reverse=True)

    if sarray==array or reversearray==array:
        print(0)
    else:

        for i in range(LastBlue):
            if array[i]=='R':
                rightRedball+=1

        for i in range(LastRed):
            if array[i]=='B':
                rightBlueball+=1
                
        for i in range(N-1,FirstRed-1,-1):
            if array[i]=="B":
                leftBlueball+=1

        for i in range(N-1,FirstBlue-1,-1):
            if array[i]=="R":
                leftRedball+=1


        print(min(rightRedball,rightBlueball,leftBlueball,leftRedball))




