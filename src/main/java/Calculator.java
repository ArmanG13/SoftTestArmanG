public class Calculator {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / power(base, -exponent);
        } else if (exponent % 2 == 0) {
            double temp = power(base, exponent / 2);
            return temp * temp;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static int subtract(int x, int y) {
        if (x == 0) return -y;
        if (y == 0) return x;
        return x - y;
    }

    public static int multiply(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else {
            return x * y;
        }
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error: division by zero");
            return Double.NaN;
        } else {
            return x / y;
        }
    }

    public static void main(String[] args) {
        int a = multiply(1, 5);
        System.out.println(a);
    }

}