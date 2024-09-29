import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn cách nhập ma trận:");
        System.out.println("1. Nhập ma trận từ bàn phím");
        System.out.println("2. Sử dụng ma trận hằng số có sẵn");
        System.out.print("Nhập lựa chọn của bạn (1 hoặc 2): ");
        int choice = scanner.nextInt();

        int[][] matrix1;
        int[][] matrix2;

        if (choice == 1) {
            // Nhập ma trận
            System.out.print("Nhập số hàng của ma trận: ");
            int rows = scanner.nextInt();
            System.out.print("Nhập số cột của ma trận: ");
            int cols = scanner.nextInt();

            // Khởi tạo ma trận
            matrix1 = new int[rows][cols];
            matrix2 = new int[rows][cols];

            System.out.println("Nhập các phần tử của ma trận 1:");
            enterMatrix(matrix1, scanner);

            System.out.println("Nhập các phần tử của ma trận 2:");
            enterMatrix(matrix2, scanner);

        } else if (choice == 2) {
            matrix1 = new int[][]{
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            matrix2 = new int[][]{
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            System.out.println("Sử dụng ma trận hằng số có sẵn:");
            System.out.println("Ma trận 1:");
            displayMatrix(matrix1);

            System.out.println("Ma trận 2:");
            displayMatrix(matrix2);

        } else {
            //không hợp lệ
            System.out.println("Lựa chọn không hợp lệ! Thoát chương trình.");
            scanner.close();
            return;
        }

        // Kiểm tra kích thước hai ma trận
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Hai ma trận không có cùng kích thước. Không thể thực hiện phép cộng!");
        } else {
            //phép cộng hai ma trận
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            //kết quả
            System.out.println("Kết quả của phép cộng hai ma trận là:");
            displayMatrix(resultMatrix);
        }

        scanner.close();
    }

    public static void enterMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Phần tử tại [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }


    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }
}
