package ArrayTasks;

public class AvgArr {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        System.out.println(arrAvg(arr));


    }

   public static double arrAvg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }
}
