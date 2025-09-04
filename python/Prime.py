start=1
end=20

for i in range(start,(end+1)):
    if i>1:
        isPrime=True
        
        for j in range(2,(i//2+1)):
            if i%j==0:
                isPrime = False
                break
        
        if isPrime:
            print(i,end=" ")