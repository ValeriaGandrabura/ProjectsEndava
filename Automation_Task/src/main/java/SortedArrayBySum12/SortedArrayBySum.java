package SortedArrayBySum12;

public class SortedArrayBySum {

    public static void main(String[] args) {

        Integer[][] numbers = {{2, 7, 9}, {9, 6, 1}, {4, 3, 8}};
        showArray(numbers);
        sortArraySum(numbers);
        showArray(numbers);
    }

    public static void showArray(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static Integer[][] sortArraySum(Integer[][] numbers) {
        int sumFirstRow = 0;
        int sumSecondRow = 0;
        int count = 1;

        while (count != 0) {
            count = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    sumFirstRow += numbers[i][j];
                    sumSecondRow += numbers[i + 1][j];
                }
                if (sumFirstRow > sumSecondRow) {
                    for (int j = 0; j < numbers.length; j++) {
                        int temp = numbers[i][j];
                        numbers[i][j] = numbers[i + 1][j];
                        numbers[i + 1][j] = temp;
                        count++;
                    }
                }
                sumFirstRow = 0;
                sumSecondRow = 0;
            }
        }
        return numbers;
    }


}
