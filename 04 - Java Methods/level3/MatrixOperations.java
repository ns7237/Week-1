import java.util.Random;
import java.util.Scanner;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of square matrix (2 or 3): ");
        int size = scanner.nextInt();
        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 and 3x3 matrices are supported.");
            return;
        }
        double[][] matrixA = generateMatrix(size, size);
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));
        double determinant = determinant(matrixA);
        System.out.println("Determinant of Matrix A: " + determinant);
        if (determinant != 0) {
            System.out.println("Inverse of Matrix A:");
            double[][] inverseMatrix = (size == 2) ? inverse2x2(matrixA) : inverse3x3(matrixA);
            displayMatrix(inverseMatrix);
        } else {
            System.out.println("Matrix A has no inverse (determinant is 0).");
        }

        scanner.close();
    }
    public static double[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10) + 1; // Random values from 1 to 10
            }
        }
        return matrix;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static double determinant(double[][] matrix) {
        if (matrix.length == 2) { // Determinant of 2x2 matrix
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        } else if (matrix.length == 3) { // Determinant of 3x3 matrix
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                 - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                 + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        return 0;
    }
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant(matrix);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant(matrix);
        if (det == 0) return null;
        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
        inverse[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]) / det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
        inverse[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) / det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
        inverse[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]) / det;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
        inverse[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]) / det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;
        return inverse;
    }
}
