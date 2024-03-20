//BonnieBao

/**
 * findSingle
 */
public class findSingle {

    //crate a function for this project
    public static int binSearch(int[] arr) {
        //defining the length of the array, which set the boundaries of the search space.
        int low = 0;
        int high = arr.length - 1;

        //use while loop 
        //The while loop that continues until the low index is less than the high index
        while (low < high) {
            //binary search starts from the middle
            int mid = (high + low) / 2;

            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    low = mid + 2; // Move to the right of the pair
                } else {
                    high = mid; // Unique element is to the left
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    low = mid + 1; // Move to the right of the pair
                } else {
                    high = mid - 1; // Unique element is to the left
                }
            }
        }
 
    return arr[low];
}
    public static void main(String[] args) {
    int[] arr = {1, 1, 2, 2, 5, 5, 6, 6, 7, 8, 8, 9, 9};
    int[] arr1 = {1, 1, 2, 2, 5, 5, 6, 6, 7,7, 8, 8, 9, 9,10,10,11,12,12};
    int[] arr2 = {1, 1, 2, 2, 5, 5, 6, 6, 7,7, 8, 8, 9, 9,10,10,11,11,12,12,13,13,14,14,15,15,16};
    System.out.println("The single element in arr is " + binSearch(arr));
    System.out.println("The single element in arr1 is " + binSearch(arr1));
    System.out.println("The single element in arr2 is " + binSearch(arr2));

}
}
