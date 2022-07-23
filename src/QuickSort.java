import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 5, 1, 5, 1, -1, -5, -2, 0, 64, 6, 51, 651, 6, 16, 51, 651, 65, 16, 51, 651, 6};
        int[] arr1 = {5, 4, 1, 5, 1, 5, 1, -1, -5, -2, 0, 64, 6, 51, 651, 6, 16, 51, 651, 65, 16, 51, 651, 6};
        //избираме пивот
        //всички по-мaлки от пивота ги слапваме от ляво
        //по-големите оставят в дясно
        //[-1, -5, -2, 0, 1, 5, 1, 5, 4, 1, 5]
        //

        quickSort(arr, 0, arr.length - 1);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        System.out.println("start=" + start + " edn=" + end);
        if (start >= end) {
            return;
        }

        int pivot = helperSort(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);

    }

    private static int helperSort(int[] arr, int start, int end) {
        int leftIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[end] > arr[i]) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[i];
                arr[i] = temp;
                leftIndex++;
            }

        }
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[end];
            arr[end] = temp;

        return leftIndex;
    }
}
