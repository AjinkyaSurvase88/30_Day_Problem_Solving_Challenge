# num=234
# sum=0 

# while num!=0:
#     sum+=num%10
#     num=num // 10
    
# print("sum = ",sum)

num=input("Num = ")
sum=0 

for i in num:
    sum=sum+int(i)
    
print("Sum = ",sum)