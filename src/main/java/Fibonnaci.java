public class Fibonnaci {

   private static long[] fibonnaciCache;

public static int fibonnaci(int num){
    if(num <= 1){
        return num;
    } else
    return fibonnaci(num-1)+ fibonnaci(num-2);
}

    public static void main(String[] args) {
    int n = 6;

        System.out.println(Fibonnaci.fibonnaci(33));

    }
}
