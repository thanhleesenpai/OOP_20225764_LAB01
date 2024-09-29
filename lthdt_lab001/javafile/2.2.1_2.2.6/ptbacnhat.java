import javax.swing.JOptionPane;

public class ptbacnhat {
    public static void main(String[] args) {
        String aInput = JOptionPane.showInputDialog(null, "Nhập hệ số a (a ≠ 0):", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(aInput);
        String bInput = JOptionPane.showInputDialog(null, "Nhập hằng số b:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(bInput);
        if (a != 0) {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nghiệm của phương trình " + a + "x + " + b + " = 0 là: x = " + x, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Hệ số 'a' không được bằng 0 đối với phương trình bậc nhất.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
}
