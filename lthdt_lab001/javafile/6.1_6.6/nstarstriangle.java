import javax.swing.JOptionPane;

public class nstarstriangle {
    public static void main(String[] args) {
        String nInput = JOptionPane.showInputDialog(null, "Nhập chiều cao của tam giác (số dòng):", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(nInput);

        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                 triangle.append(" ");
            }

             for (int k = 1; k <= (2 * i - 1); k++) {
                triangle.append("*");
            }

            triangle.append("\n");
        }

        JOptionPane.showMessageDialog(null, triangle.toString(), "Hình tam giác cân", JOptionPane.INFORMATION_MESSAGE);
    }
}

