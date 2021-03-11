package Math;
import java.lang.Math;

public class MathOpgave {


    public static long matOpgave(int n){
        long value = 0;
        int loop = n/2;
        for (int k = 1; k <=loop; k++) {
             value += 2*k;

            
        }
        return value;

    }

    public static void main(String[] args) {
        System.out.println(matOpgave(100));
        System.out.println(matOpgave(1000));
        System.out.println(matOpgave(1000000));
        long n = 1550;
        for (int i = 0; i <=8 ; i++) {
            System.out.println(n);
            n = n*1550;

        }
        System.out.println(n);

    }
}
