package Search;
//import java.util.Arrays;

public class BinarySearch {
    
    public static void main(String[] args) {
        
        //Binary Search
        //Time Complexity: O(log n)
        //Search algorithm that finds the position of a target value within a sorted array.
        //Half of the array is eliminated during each "step"

        int array[] = new int[10000000];
        int target = 742;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            int value = array[middleIndex];

            System.out.println("Middle: " + value);

            if (value < target) lowIndex = middleIndex + 1;
            else if (value > target) highIndex = middleIndex - 1;
            else return middleIndex;
        }
        return -1;
    }
}
