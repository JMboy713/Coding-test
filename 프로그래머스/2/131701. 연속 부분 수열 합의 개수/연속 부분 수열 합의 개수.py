# 반복문을 -로 타면 - 값은 인덱싱이 뒤로 간다.

def solution(elements):
    length=len(elements)
    arr=elements*2
    result =[]
    for i in range(length):
        ele=elements[i]
        result.append(elements[i])
        
        for j in range(i+1,i+length):
            ele+=arr[j]
            result.append(ele)
    result=set(result)
    return len(result)