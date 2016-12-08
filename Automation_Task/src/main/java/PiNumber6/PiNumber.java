package PiNumber6;

public class PiNumber {
    public static void main(String[] args) {

        int r = 10;
        int n = 1500;

        double angle = (180- 360/(double)n)/2;
        double base = 2 * r * Math.cos(Math.toRadians(angle));
        double Pn = (double)n * base;

        double Pi = Pn/(2*r);

        System.out.println("Number Pi = " + Pi);

    }
}
