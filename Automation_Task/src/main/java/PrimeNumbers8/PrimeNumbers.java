package PrimeNumbers8;

public class PrimeNumbers {

    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        Integer[] array = new Integer[number + 1];


        for (int i = 1; i <= number; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");

        }
        System.out.println("");

        for (int i = 3; i < number; i+=2 ) {
            for (int j = 2; j < number/2; j++)
                if (array[i] % array[j] == 0)
                    count++;
            if (count ==1 || count ==0)
                System.out.print(array[i]+" ");

            count = 0;

        }




    }

}
