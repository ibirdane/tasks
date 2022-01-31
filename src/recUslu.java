public class recUslu {

    public static void main(String[] args) {

        System.out.println(us(2,5));
    }

    public static int us(int num, int uss){
        if(uss ==0 ){
            return 1;
        }

        return num*us(num, uss-1);


    }
}
