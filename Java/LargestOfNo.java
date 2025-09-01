class LargestOfNo{
    public static void main(String[] args){
        int num1=8,num2=9,num3=4;
        
        if(num1>num2 && num1>num3){
            System.out.println("num1 is greater");
        }
        if(num2>num3 && num2>num1){
            System.out.println("num2 is greater");
        }
        if(num3>num2 && num3>num1){
            System.out.println("num3 is greater");
        }
    }
}