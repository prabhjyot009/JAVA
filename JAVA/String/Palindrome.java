public class Palindrome {
    public static void main(String[] args) {
        //abcdcba
        //while using length in string it is a function or a method//in array it is a variable ;
        String str="abcacba";
        System.out.println(Palindrome(str));
    }
    static boolean Palindrome(String str){
        str=str.toLowerCase();
        if(str ==null || str.length()==0){
            return true;
        }
        for (int i = 0; i < str.length()/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);//-i because -2 we are doing

            if(start!=end){
                return false;
            }
        }
        return true;
    }    
}
