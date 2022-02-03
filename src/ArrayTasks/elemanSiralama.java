package ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class elemanSiralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dizinin boyutu : ");
        int len=sc.nextInt();
        int [] arr = new int[len];

        for(int i=0;i<len;i++){
            System.out.println("Dizinin elemanlarini giriniz: ");
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
