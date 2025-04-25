package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] values) {

        int lastUnsorted= values.length-1;;

        while(lastUnsorted >= 0) {
            int maxIndex=0;
            int maxValue=values[0];

            // For Loop for find max value
            for(int i=1;i<=lastUnsorted;i++) {
                if(values[i]>maxValue) {


                    maxIndex=i;
                    maxValue=values[i];
                }
            }

            // Show current max and where it's being moved
            System.out.println("Max value " + maxValue + " found at index " +
                    maxIndex + ", swapping with index " + lastUnsorted);

            //  then swap it with the last one, and add it to the sorted section
            values[maxIndex]=values[lastUnsorted];
            values[lastUnsorted]=maxValue;

            // Print array after each swap
            System.out.println("Array after iteration: " + Arrays.toString(values));

            lastUnsorted--;
        }


    }

    public static void main(String[] args) {

        int[] values={5,6,3,2,9,1,2,1};
        System.out.println("Original array: " + Arrays.toString(values));
        sort(values);
        System.out.println("Sorted array: " + Arrays.toString(values));

    }
}
