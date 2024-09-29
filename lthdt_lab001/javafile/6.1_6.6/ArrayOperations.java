import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;

        System.out.println("Chọn cách nhập mảng:");
        System.out.println("1. Nhập mảng từ bàn phím");
        System.out.println("2. Sử dụng mảng hằng số có sẵn");
        System.out.print("Nhập lựa chọn của bạn (1 hoặc 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();

            array = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

        } else if (choice == 2) {
            array = new int[]{8, 3, 5, 2, 9}; 
            System.out.println("Sử dụng mảng hằng số: " + Arrays.toString(array));
        } else {
            System.out.println("Lựa chọn không hợp lệ! Thoát chương trình.");
            scanner.close();
            return;
        }

        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println("Tổng các phần tử của mảng: " + sum);
        System.out.println("Giá trị trung bình của mảng: " + average);

        scanner.close();
    }
}
