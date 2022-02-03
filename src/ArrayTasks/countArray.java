package ArrayTasks;

import java.util.Arrays;

public class countArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 0 ;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            System.out.println(arr[i]+" sayisi "+count + " kere tekrar etti");
            count=0;
        }

    }
}
