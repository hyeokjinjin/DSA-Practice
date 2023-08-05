package Search;
public class LinearSearch{

    public static void main(String[] args) {
        
        //Linear Search = Iterating through a collection one element at a time
        //Does not need to be sorted
        //Time Complexity: O(n)

        
        int[] linearSearchArray = {9, 1, 5, 2, 3, 4, 6, 8, 7};
        int index =  linearSearch(linearSearchArray, 8);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}