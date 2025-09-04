// class ReverseString{
//     public static void main(String[] args) {
//         String str="hello";

//         int n= String.valueOf(str).length();
        
//         for(int i=1;i<=n;i++){
//             System.out.print(str.charAt(n-i));
//         }
//     }
// }


class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(new StringBuilder(str).reverse());
    }
}


