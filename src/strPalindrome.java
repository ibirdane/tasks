public class strPalindrome {



    public static void main(String[] args) {
        String s1 ="aga";
        String s2="asd";
        String s3="ababa";
        String s4="taksi";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));

    }

    static boolean isPalindrome(String str){
        if(str.equals(reverse(str))){
            return true;
        }else{
            return false;
        }
    }

    static String reverse(String str){
        String revStr="";

        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        return revStr;
    }



}
