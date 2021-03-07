package dk.cphbusiness.mal.utils;

import java.io.IOException;

public class MergeSortStr {

    void merge(String arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        String L[] = new String[n1];
        String R[] = new String[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareToIgnoreCase(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(String arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }


    public static void main(String args[]) throws IOException {
        String[] str = FileUtility.toStringArray("D:\\java projects\\soft2021spring-mal\\data\\" +
                "king-james-bible.txt", "[^A-Za-z']+");
                //"shakespeare-complete-works.txt", "[^A-Za-z']+");
        MergeSortStr ob = new MergeSortStr();

        long startTime = System.nanoTime();

        ob.sort(str, 0, str.length - 1);
        for (int i = 0; i < str.length; ++i)
            System.out.print(str[i] + " ");

        long endTime = System.nanoTime();
        long runTime = (endTime - startTime)/ 1000000;

        System.out.println("\nrun time was : "+ runTime + " milliseconds"); // 2787 was my result
    }
}
