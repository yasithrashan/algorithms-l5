package searching;

public class BinarySearch {

    public static int binarySearch(int[] values , int findMe){

        int first = 0 , last = values.length-1;

        while(first <= last){

            // Check the middle value
            int middle = (first + last)/2;

            if(values[middle] == findMe){
                System.out.println("Found element at index " + middle);
                return middle;
            }

            else if(values[middle] < findMe){
                first = middle + 1;
            }

            else{
                last = middle - 1;
            }
        }

        System.out.println("No element found");
        return -1;
    }

    public static void main(String[] args) {

        int[] values={2,5,8,11,34,43};

        int findMe = 5;

        binarySearch(values, findMe);
    }
}
