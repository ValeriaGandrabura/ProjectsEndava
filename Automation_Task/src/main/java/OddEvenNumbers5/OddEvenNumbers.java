package OddEvenNumbers5;

public class OddEvenNumbers {

    public static void main(String[] args) {
        Integer[] numbers = {4, 10, 5, 7, 54, 21, 16, 9};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if ((numbers[i]%2) == 0)
                count ++;
            else
                sum = numbers[i]+sum;
        }
        System.out.println("Sum of odd numbers is "+sum);
        System.out.println("Amount of even numbers is "+count);

    }



}
