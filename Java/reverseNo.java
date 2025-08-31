public class reverseNo{
    public static void main(String[] args){
        int num=1234, reverse= 0, rem;

        while(num!=0){
            rem=num%10;
            reverse=rem+reverse*10;
            num/=10;
        }
        
        System.out.println("Reverse no = " + reverse);
    }
}