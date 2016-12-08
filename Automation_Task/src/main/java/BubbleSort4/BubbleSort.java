package BubbleSort4;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] array = {60, 5, 15, 20, 4, 8};
        Integer[] array2 = bubblesort (array);

        for (int i = 0 ; i < array.length; i++)
            System.out.println(array2[i]);
    }

    public static Integer[] bubblesort(Integer[] array){
        int n = array.length ;

        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return array;


    }



}
