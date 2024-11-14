import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var z = arr1();
        var x = arr2();
        var r = arr3(z, x);
        printMatrix(r);
    }

    public static int[] arr1() {
        int[] h = new int[11];
        for (int i = 0; i < 11; i++) {
            h[i] = (int) (23 - 2 * i);
        }
        return h;
    }

    public static double[] arr2() {
        double[] x = new double[19];
        Random rand = new Random();

        for (int i = 0; i < 19; i ++) {
            x[i] = rand.nextDouble(-6.0, 3.0);
        }
        return x;
    }

    public static double[][] arr3(int[] z, double[] x) {
        double[][] r = new double[11][19];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 19; j ++) {
                r[i][j] = matrixValue(x[j], z[i]);
            }
        }
        return r;
    }

    public static double matrixValue(double x, int zi) {
        return switch (zi) {
            case 7 -> (2.0 / 3.0) * (Math.tan(Math.sin(x)) - 4);
            case 3, 11, 13, 21, 23 -> Math.pow(2 / Math.pow(((3.0 / 4.0 + Math.pow(Math.pow(3-x, x), 1.0 / 4.0 * (x-1)))), 2), Math.cos(Math.tan(x)));
            default -> Math.asin(1.0 / (Math.pow(Math.E, Math.sqrt(Math.pow(Math.abs(x) / 2.0, 2)))));
        };
    }

    public static void printMatrix (double[] [] matrix) {
        for (int i = 0; i < 11; i ++) {
            for (int j = 0; j < 19; j ++) {
                System.out.printf("%7.2f", matrix[i][j]);
            }
            System.out.println("\n");
        }
    }

}