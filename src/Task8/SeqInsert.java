package Task8;
import java.util.Scanner;
public class SeqInsert {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            double[] inputArray1 = new double[N];
            for (int i = 0; i < N; i++) {
                System.out.println("Enter " + i);
                inputArray1[i] = sc.nextDouble();
            }

            System.out.println("Enter M:");
            //int M = sc.nextInt();
            double[] inputArray2 = new double[N];
            for (int i = 0; i < N; i++) {
                System.out.println("Enter " + i);
                inputArray2[i] = sc.nextDouble();
            }
            createSequence(inputArray1, inputArray2);
        }
    }

    private static void createSequence(double[] a, double[] b) {
        int i = 0;
        for (double el : b) {
            while (i < a.length) {
                if (el <= a[i]) {
                    break;
                }
                System.out.print(a[i] + " ");
                i++;
            }
            System.out.print("/:" + el + ":/");
        }

        while (i < a.length) {
            System.out.print( a[i] + " ");
            i++;
        }
    }
}
