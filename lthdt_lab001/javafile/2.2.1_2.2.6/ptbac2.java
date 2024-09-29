import javax.swing.JOptionPane;

public class ptbac2 {
    public static void main(String[] args) {
        String aInput = JOptionPane.showInputDialog(null, "Nhập hệ số a (a ≠ 0):", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(aInput);
        String bInput = JOptionPane.showInputDialog(null, "Nhập hệ số b:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(bInput);
        String cInput = JOptionPane.showInputDialog(null, "Nhập hằng số c:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(cInput);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Hệ số 'a' không được bằng 0 đối với phương trình bậc hai.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm phân biệt:\n x1 = " + x1 + "\n x2 = " + x2, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép: x = " + x, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm (không có nghiệm thực).", "Kết quả", JOptionPane.ERROR_MESSAGE);
        }
    }
}
