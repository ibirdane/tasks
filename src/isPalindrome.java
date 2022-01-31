public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromee(827));
        System.out.println(isPalindromee(141));
        System.out.println(isPalindromee(232));
    }

    static boolean isPalindromee(int num){
        int sayi =num, ters=0;
        int num2;
        while(sayi!=0){
            num2=sayi%10;
            sayi/=10;
            ters=(ters*10)+num2;
        }

        if(ters==num){
            return true;
        }else {
            return false;
        }


    }

}
