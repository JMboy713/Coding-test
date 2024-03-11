# H-index : 생산성과 영향력 
# h = 
# 논문 n편중 h번 이상 인용된 논문이 h편 이상이고, 나머지가 h번 이하 인용되었다면 h의 최댓값이 h-index 이다. 
# 논문 n편 중, a번 이상 인용된 논문이 b편 이상이면 a 와 b중 작은 값이 hIndex 값입니다.

def solution(citations):
    maximum=0
    length=len(citations)
    citations.sort(reverse=True)
    for idx,val in enumerate(citations):
        result=min(idx+1,val)
        maximum=max(result,maximum)
            
    return maximum
    