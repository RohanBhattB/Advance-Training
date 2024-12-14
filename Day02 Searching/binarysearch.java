
public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int low = 0;
        int high = arr.length - 1;
        int key = 23;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key == arr[mid]) {
                System.out.println("Element found at the index: " + mid);
                return; // Exit the loop when the element is found
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}
