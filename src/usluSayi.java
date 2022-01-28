import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        int sayi = sc.nextInt();
        System.out.println("üssü giriniz");
        int us = sc.nextInt();
        int res=1;
        for(int i=0;i<us;i++){
          res=res*sayi;
        }

        System.out.println(res);
    }
}
