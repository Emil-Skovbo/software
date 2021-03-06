/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.mal.utils;

import java.io.IOException;

/**
 * @author Emil s
 */
class SelectInsertionSort {


//   public static void selectionSort(String[] arr){  
//        for (int i = 0; i <= arr.length; i++)  
//        {  
//            int index = i;  
//            for (int j = i + 1; j < arr.length; j++){  
//                if (arr[j] < arr[index]){  
//                    index = j;//searching for lowest index  
//                }  
//            }  
//            int smallerNumber = arr[index];   
//            arr[index] = arr[i];  
//            arr[i] = smallerNumber;  
//        }  
//    }

    static void selectionSort(String arr[],int n)
    {
        // One by one move boundary of unsorted subarray
        for(int i = 0; i < n - 1; i++)
        {

            // Find the minimum element in unsorted array
            int min_index = i;
            String minStr = arr[i];
            for(int j = i + 1; j < n; j++)
            {

            /*compareTo() will return a -ve value,
            if string1 (arr[j]) is smaller than string2 (minStr)*/
                // If arr[j] is smaller than minStr

                if(arr[j].compareTo(minStr) < 0)
                {
                    // Make arr[j] as minStr and update min_idx
                    minStr = arr[j];
                    min_index = j;
                }
            }

            // Swapping the minimum element
            // found with the first element.
            if(min_index != i)
            {
                String temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static String[] insertionSort(String array[], int f){
        String temp="";
        for(int i=0;i<f;i++){
            for(int j=i+1;j<f;j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }




    public static void main(String[] args) throws IOException {
        System.out.println("Starting: \n");
        String[] str = FileUtility.toStringArray("D:\\java projects\\soft2021spring-mal\\data\\" +
                "king-james-bible.txt", "[^A-Za-z']+");
        //"shakespeare-complete-works.txt", "[^A-Za-z']+");
        //selectionSort(str, str.length);
        insertionSort(str,str.length);

        String[] array = { "abc", "xyz",
                "abcd", "bcd", "abc" };
        for (int i = 0; i < str.length; ++i)
            System.out.print(str[i] + " ");

    }

}
