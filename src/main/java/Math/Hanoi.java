package Math;

import java.util.Stack;

public class Hanoi {
    // Java recursive function to solve tower of hanoi puzzle

    public static int N;
    /* Creating Stack array */
    public static Stack<Integer>[] tower = new Stack[4];

    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod, int m)
    {

        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            System.out.println("Move disk 1 from rod " + " | " +  from_rod + " | " + "to rod " + " | " + to_rod + " | " );
            System.out.println(" A | B | C");
            System.out.println("\n");
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod, m);
        //printnn(n, m);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod, m);
    }
    public static void display() {
        System.out.println("  A  |  B  |  C");
        System.out.println("---------------");
        for (int i = N - 1; i >= 0; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(tower[1].get(i));
            } catch (Exception e) {
            }
            try {
                d2 = String.valueOf(tower[2].get(i));
            } catch (Exception e) {
            }
            try {
                d3 = String.valueOf(tower[3].get(i));
            } catch (Exception e) {
            }
            System.out.println("  " + d1 + "  |  " + d2 + "  |  " + d3);
        }
        System.out.println("\n");
    }

    public static void printnn(int n, int m){

        for (int i = 1 ; i<=m; i++){
            String d1 = "#", d2 = "#", d3 = "#";
            d1 = d1.valueOf(i);

            //System.out.println(" " + d1 + " | " + d2 + " | " + d3);
            for (int j = n; j <m; j++) {

            }
            if(n == 3){
                System.out.println(" " + "#" + " | " + "#" + " | " + "#");
                System.out.println(" " + "#" + " | " + "#" + " | " + "#");
                System.out.println(" " + "#" + " | " + m + " | " + n);
                break;
            }
            else if(n == 2){
                System.out.println(" " + d1 + " | " + n + " | " + d3);
            }
            else{
                System.out.println(" " + d1 + " | " + "#" + " | " + n);
            }

        }


        System.out.println(" A | B | C");
        System.out.println("\n");
    }
    //  Driver method
    public static void main(String args[])
    {
        int n = 3; // Number of disks
        int m = n;
        System.out.println("\n");
        towerOfHanoi(n, 'A', 'C', 'B',m);  // A, B and C are names of rods
    }

}
