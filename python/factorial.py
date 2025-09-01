
fact=1
i=1
def findFact(num):
    if num==1 or num==0:
        return 1
    else :
        return num*findFact(num-1)
        
print(findFact(5))    

        