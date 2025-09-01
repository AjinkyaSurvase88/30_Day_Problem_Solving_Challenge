# num=6

# num1=0
# num2=1
# print(0)
# for i in range(0,num):
#     print(num2)
#     temp=num2
#     num2=num1+num2
#     num1=temp
    
    
num = 6

a, b = 0, 1
for _ in range(num):
    print(b)
    a, b = b, a + b
