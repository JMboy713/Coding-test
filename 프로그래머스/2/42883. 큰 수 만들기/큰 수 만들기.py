def solution(number, k):
    arr=[]
    for num in number:
        while arr and arr[-1]<num and k>0:
            k-=1
            arr.pop()
        arr.append(num)
            
    if k!=0:
        arr=arr[:-k]
    return ''.join(arr)
            
    