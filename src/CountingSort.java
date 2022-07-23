import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 5, 1, 5, 1,-1,-5,-2,-8};

        CountingSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void CountingSort(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        //find max and min value

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        //initializing helper array
        int[] helper = new int[max - min + 1];
        //fill helper with correct values
        for (int i = 0; i < arr.length; i++) {
            ++helper[arr[i] - min];
        }
        System.out.println(Arrays.toString(helper));
        int arrIndex = 0;
        //add(sorting) correct value
        for (int i = 0; i < helper.length; i++) {

            for (int j = 0; j < helper[i]; j++) {
                arr[arrIndex] = min+i;
                arrIndex++;
            }
        }

    }
}
