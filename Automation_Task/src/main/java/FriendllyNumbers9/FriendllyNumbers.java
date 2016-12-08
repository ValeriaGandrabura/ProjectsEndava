package FriendllyNumbers9;

public class FriendllyNumbers {

    public static void main(String[] args) {

        int number = 3000;
        friendllyNumbers(sharedValue(fillArray(number)));

    }

    public static Integer[] fillArray (int number){

        Integer[] array = new Integer[number + 1];
        for (int i = 1; i <= number; i++) {
            array[i] = i;
        }
        return array;

    }

    public static Double[] sharedValue (Integer[] array){

        Double[] restArray = new Double[array.length];
        int sum = 0;
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 1; j < i; j++) {
                if (array[i] % array[j] == 0) {
                    sum += array[j];
                }
            }
            double rest = (double) sum / (double) array[i];
            restArray[i-1] = rest;

            sum = 0;
            rest = 0;
        }
        return restArray;

    }

    public static void friendllyNumbers (Double[] restArray) {

        for (int i = 0; i < restArray.length-1; i++) {
            for (int k = i + 1; k < restArray.length-1; k++) {
                if (restArray[i].equals(restArray[k])) {
                    System.out.println("Friendlly numbers: "+(i+1) + " and " +(k+1));
                }

            }
        }

    }


}
