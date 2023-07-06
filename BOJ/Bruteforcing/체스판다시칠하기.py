N,M=map(int,input().split())

max_width=(N-7)
max_length=(M-7)

chess_board=[]
for i in range(N):
    string=input()
    array=[]
    for j in string:
        array.append(j)
    chess_board.append(array)



result=[]
for i in range(max_width):
    for j in range(max_length):
        count=0
        count2=0
        
        if chess_board[i][j]=="B": # 시작점이 B라면
            for k in range(8):
                if k%2==0:
                    if chess_board[i+k][j]=="W": 
                        count+=1
                    if chess_board[i+k][j+1]=="B": 
                        count+=1
                    if chess_board[i+k][j+2]=="W":
                        count+=1
                    if chess_board[i+k][j+3]=="B": 
                        count+=1
                    if chess_board[i+k][j+4]=="W":
                        count+=1
                    if chess_board[i+k][j+5]=="B": 
                        count+=1
                    if chess_board[i+k][j+6]=="W": 
                        count+=1
                    if chess_board[i+k][j+7]=="B": 
                        count+=1

                    if chess_board[i+k][j]=="B": 
                        count2+=1
                    if chess_board[i+k][j+1]=="W": 
                        count2+=1
                    if chess_board[i+k][j+2]=="B":
                        count2+=1
                    if chess_board[i+k][j+3]=="W": 
                        count2+=1
                    if chess_board[i+k][j+4]=="B":
                        count2+=1
                    if chess_board[i+k][j+5]=="W": 
                        count2+=1
                    if chess_board[i+k][j+6]=="B": 
                        count2+=1
                    if chess_board[i+k][j+7]=="W": 
                        count2+=1
                
    
                
                else:
                    if chess_board[i+k][j]=="B": 
                        count+=1
                    if chess_board[i+k][j+1]=="W": 
                        count+=1
                    if chess_board[i+k][j+2]=="B":
                        count+=1
                    if chess_board[i+k][j+3]=="W": 
                        count+=1
                    if chess_board[i+k][j+4]=="B":
                        count+=1
                    if chess_board[i+k][j+5]=="W": 
                        count+=1
                    if chess_board[i+k][j+6]=="B": 
                        count+=1
                    if chess_board[i+k][j+7]=="W": 
                        count+=1
                    
                    if chess_board[i+k][j]=="W": 
                        count2+=1
                    if chess_board[i+k][j+1]=="B": 
                        count2+=1
                    if chess_board[i+k][j+2]=="W":
                        count2+=1
                    if chess_board[i+k][j+3]=="B": 
                        count2+=1
                    if chess_board[i+k][j+4]=="W":
                        count2+=1
                    if chess_board[i+k][j+5]=="B": 
                        count2+=1
                    if chess_board[i+k][j+6]=="W": 
                        count2+=1
                    if chess_board[i+k][j+7]=="B": 
                        count2+=1

                

                        
        elif chess_board[i][j]=="W": # 시작점이 B라면
            for k in range(8):
                if k%2==0:
                    if chess_board[i+k][j]=="B": 
                        count+=1
                    if chess_board[i+k][j+1]=="W": 
                        count+=1
                    if chess_board[i+k][j+2]=="B":
                        count+=1
                    if chess_board[i+k][j+3]=="W": 
                        count+=1
                    if chess_board[i+k][j+4]=="B":
                        count+=1
                    if chess_board[i+k][j+5]=="W": 
                        count+=1
                    if chess_board[i+k][j+6]=="B": 
                        count+=1
                    if chess_board[i+k][j+7]=="W": 
                        count+=1

                    if chess_board[i+k][j]=="W": 
                        count2+=1
                    if chess_board[i+k][j+1]=="B": 
                        count2+=1
                    if chess_board[i+k][j+2]=="W":
                        count2+=1
                    if chess_board[i+k][j+3]=="B": 
                        count2+=1
                    if chess_board[i+k][j+4]=="W":
                        count2+=1
                    if chess_board[i+k][j+5]=="B": 
                        count2+=1
                    if chess_board[i+k][j+6]=="W": 
                        count2+=1
                    if chess_board[i+k][j+7]=="B": 
                        count2+=1
                    
                else:
                    if chess_board[i+k][j]=="W": 
                        count+=1
                    if chess_board[i+k][j+1]=="B": 
                        count+=1
                    if chess_board[i+k][j+2]=="W":
                        count+=1
                    if chess_board[i+k][j+3]=="B": 
                        count+=1
                    if chess_board[i+k][j+4]=="W":
                        count+=1
                    if chess_board[i+k][j+5]=="B": 
                        count+=1
                    if chess_board[i+k][j+6]=="W": 
                        count+=1
                    if chess_board[i+k][j+7]=="B": 
                        count+=1

                    if chess_board[i+k][j]=="B": 
                        count2+=1
                    if chess_board[i+k][j+1]=="W": 
                        count2+=1
                    if chess_board[i+k][j+2]=="B":
                        count2+=1
                    if chess_board[i+k][j+3]=="W": 
                        count2+=1
                    if chess_board[i+k][j+4]=="B":
                        count2+=1
                    if chess_board[i+k][j+5]=="W": 
                        count2+=1
                    if chess_board[i+k][j+6]=="B": 
                        count2+=1
                    if chess_board[i+k][j+7]=="W": 
                        count2+=1
                        
        result.append(min(count,count2))


print(min(result))
                    
                    

