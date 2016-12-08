package SortedArrays11;

import java.util.Arrays;

public class SortedArrays {

    public static void main(String[] args) {
        Integer[] array1 = {1, 5, 5};
        Integer[] array2 = {2, 6, 7};
        Integer[] array3 = {1, 4, 7, 8};
        Integer[] result = new Integer[array1.length + array2.length + array3.length];

        int i = 0, j = 0, k = 0;

        for (int l = 0; l < result.length; l++) {
            result[l] = i < array1.length && (j >= array2.length || array1[i] < array2[j])
                    ? (k >= array3.length || array1[i] < array3[k]
                    ? array1[i++]
                    : array3[k++])
                    : (j < array2.length && (k >= array3.length || array2[j] < array3[k])
                    ? array2[j++]
                    : array3[k++]);
        }

        System.out.println(Arrays.toString(result));
    }
}
