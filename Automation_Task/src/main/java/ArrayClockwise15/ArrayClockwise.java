package ArrayClockwise15;

public class ArrayClockwise {
    public static void main(String[] args) {
        Integer[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int row = numbers.length;
        int column = numbers[0].length;
        Integer[][] arrayClock = new Integer[column][row];

        showArray(numbers);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrayClock[j][arrayClock.length-i] = numbers[i][j] ;
            }
        }
        showArray(arrayClock);
    }

    public static void showArray (Integer[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("\t"+array[i][j]);
            } System.out.println("");
        }
        System.out.println("\n");
    }
}
