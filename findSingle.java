/**
 * findSingle
 */
public class findSingle {

    public static int binSearch(int[] arr) {
        //defining the length of the array, which set the boundaries of the search space.
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        //use while loop 
        while (low < high) {
            int mid = low + (high - low) / 2;
            int midVal = arr[mid];

            if (mid % 2 == 0) {
                if (mid + 1 < n && arr[mid + 1] == midVal) {
                    low = mid + 2;
                } else {
                    high = mid;
                }

            } else {
                
                if (mid - 1 >= 0 && arr[mid - 1] == midVal) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
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
