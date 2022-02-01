import java.util.Scanner;

public class DesenMetod {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        desen(17);
    }

    public static String desen(int num){
       if(num<=0){
           return num+" "+desen(num+5);

       }

        return num+" "+desen(num-5);


    }
}
