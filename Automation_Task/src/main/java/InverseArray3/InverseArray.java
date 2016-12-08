package InverseArray3;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        float[] numbers = {0.5f, 1.2f, 5.2f, 20.4f, 154.658f};

        for (int i = 0; i < numbers.length / 2; i++) {
            float temp = numbers[i];
            numbers[i] = numbers[(numbers.length - 1)-i];
            numbers[(numbers.length - 1)-i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
