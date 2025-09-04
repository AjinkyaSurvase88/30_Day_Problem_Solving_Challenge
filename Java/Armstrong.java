class Armstrong{
    int findArmstrong(int num){
        int original=num;
        int sum = 0;

        int n=String.valueOf(num).length();

        while(num>0){
            int digit= num%10;
            sum += Math.pow(digit,n);
            num=num/10;

        }
        if(sum == original){
            return 1;
        }else{
            return 0;
        }

    }
    public static void main(String[] args){
        Armstrong obj=new Armstrong();

        int num=153;

        if(obj.findArmstrong(num)==1){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}