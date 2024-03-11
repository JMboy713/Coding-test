# 행렬 곱
# [[1,4]      [3,3,3]
# [3,2]       [3,3]
# [4,1]]   
# 0,0 / 0,1 => 0,0
# [[(0,0),(0,1)]
# [(1,0),(1,1)]
# [(2,0),(2,1)]]
def productMatrix(A, B):
    return [[sum(a*b for a, b in zip(A_row,B_col)) for B_col in zip(*B)] for A_row in A]

def solution(arr1, arr2):
    return productMatrix(arr1,arr2)
#     answer = [[0 for _ in range(len(arr2[0]))] for i in range(len(arr1))]
    
#     # 0,1,2
#     for i in range(len(arr1)):
#         array=[]
#         # 0,1,2
#         for j in range(len(arr2[0])):
#             # 0,1
#             for k in range(len(arr1[0])):
#                 answer[i][j]+=arr1[i][k]*arr2[k][j]
                
            
            
#     return answer



