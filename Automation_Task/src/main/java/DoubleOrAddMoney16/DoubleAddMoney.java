package DoubleOrAddMoney16;

public class DoubleAddMoney {

    public static void main(String[] args) {

        int n = 87;
        int count = 0;
        while (n > 1) {
            if (n % 2 != 0) {
                System.out.print(n);
                n = n - 1;
                count++;
                System.out.println("-1="+ n);
            } else {
                System.out.print(n);
                n = n / 2;
                count++;
                System.out.println("/2="+n);
            }
        }
        System.out.println("Smallest number of move is "+count);
    }
}
