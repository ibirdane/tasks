package ArrayTasks;

import java.util.Arrays;

public class minMax {
    public static void main(String[] args) {
        int [] list ={5,7,12,3,87,5,7,0,4,3,-75,-50,-4};
        int max=list[0];
        int min=list[0];

      for (int i: list){
          if(i<min){
              min=i;
          }
          
          if(i>max){
              max=i;
          }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
