import java.util.Arrays;

public class SortArray {

    public int[] sortArray(int[] array) {
        if (array.length <= 0) {
            return array;
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j > i ; j--) {
                if (array[j-1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }

//    public static void main(String[] args) {
//        int[] arr = {4, -3, 7, -12, 5, -2, 9, 4, 12};
//        System.out.println(Arrays.toString(sortArray(arr)));
//    }
}

