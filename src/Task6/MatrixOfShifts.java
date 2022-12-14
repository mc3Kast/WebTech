package Task6;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixOfShifts {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] inputArray = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.println("Enter " + i);
                inputArray[i] = sc.nextInt();
            }
            printMatrix(generateMatrix(inputArray, N), N);
        }
    }

    private static int[][] generateMatrix(int[] inputArray, int N) {
        int index = 0;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            index = i;
            for (int j = 0; j < N; j++) {
                result[i][j] = inputArray[index];
                index++;
                if (index == inputArray.length){
                    index = 0;
                }
            }
        }
        return result;
    }

    private static void printMatrix(int[][] result, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
