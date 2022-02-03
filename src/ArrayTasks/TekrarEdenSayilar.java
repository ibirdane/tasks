package ArrayTasks;

import java.util.Arrays;

public class TekrarEdenSayilar {

    static boolean isFind(int[]arr, int value){
        for(int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr={3,5,1,2,6,23,64,5,9,9,23,64,87,4,6,87,2,6};
        int[] arr2= new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                if((i!=j)&&(arr[i]==arr[j])&&(arr[j]%2==0)){
                    if(!isFind(arr2,arr[i])){
                        arr2[index++]=arr[i];

                    }
                    break;
                }
            }
        }

        for(int value : arr2){
            if(value!=0){
                System.out.println(value);
            }
        }

    }
}
