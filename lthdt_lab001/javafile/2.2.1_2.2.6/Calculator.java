import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        String strNum2 = JOptionPane.showInputDialog("Nhập số thứ hai:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String result = "Tổng: " + sum + "\n" +
                        "Hiệu: " + difference + "\n" +
                        "Tích: " + product + "\n";
        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Thương: " + quotient;
        } else {
            result += "Không thể chia cho 0.";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
}
