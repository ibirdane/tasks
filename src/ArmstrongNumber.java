import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println("Sayini giriniz");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int basamak=1;
        long sayi = num;
        while(sayi>10){
            sayi = sayi/10;
            ++basamak;
        }
        long toplam=0;
       long bolen=1;
        while(bolen<num/10){
            bolen*=10;
        }
        System.out.println(bolen);
        long genelToplam=0;
        while(bolen>0){

            toplam=toplam+num/bolen;
            num=num-((num/bolen)*bolen);
            bolen=bolen/10;
        }

        System.out.println(toplam);

    }
}
