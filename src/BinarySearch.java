public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15};
        // target 5
        //           1 2 3 4 5 6 7
        //                 4 5 6 7
        //

        System.out.println(search(arr, 9, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int startIndex, int lastIndex) {

        int mid = (startIndex + lastIndex) / 2;

        if (startIndex > lastIndex) {
            return -1;
        }

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return search(arr, target, mid + 1, lastIndex);
        } else {
            return search(arr, target, startIndex, mid - 1);
        }

    }
}
