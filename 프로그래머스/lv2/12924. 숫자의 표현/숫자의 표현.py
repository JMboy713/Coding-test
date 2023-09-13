def solution(n):
    answer = 0
    for i in range(1,n+1):
        a=i
        while a<=n:
            if a==n:
                answer+=1
                break
            elif i<n:
                i+=1
                a+=i
            
            
        
                
    return answer