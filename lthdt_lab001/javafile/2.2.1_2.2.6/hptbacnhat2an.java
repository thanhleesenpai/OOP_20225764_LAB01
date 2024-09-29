import javax.swing.JOptionPane;

public class hptbacnhat2an {
    public static void main(String[] args) {
        String a1Input = JOptionPane.showInputDialog(null, "Nhập hệ số a1 của phương trình thứ nhất:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double a1 = Double.parseDouble(a1Input);
        String b1Input = JOptionPane.showInputDialog(null, "Nhập hệ số b1 của phương trình thứ nhất:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double b1 = Double.parseDouble(b1Input);
        String c1Input = JOptionPane.showInputDialog(null, "Nhập hằng số c1 của phương trình thứ nhất:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double c1 = Double.parseDouble(c1Input);

        String a2Input = JOptionPane.showInputDialog(null, "Nhập hệ số a2 của phương trình thứ hai:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double a2 = Double.parseDouble(a2Input);
        String b2Input = JOptionPane.showInputDialog(null, "Nhập hệ số b2 của phương trình thứ hai:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double b2 = Double.parseDouble(b2Input);
        String c2Input = JOptionPane.showInputDialog(null, "Nhập hằng số c2 của phương trình thứ hai:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        double c2 = Double.parseDouble(c2Input);

        double D = a1 * b2 - a2 * b1;
        double D1 = c1 * b2 - c2 * b1;
        double D2 = a1 * c2 - a2 * c1;

        if (D != 0) {
            double x = D1 / D;
            double y = D2 / D;
            JOptionPane.showMessageDialog(null, "Hệ phương trình có nghiệm duy nhất: x = " + x + ", y = " + y, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "Hệ phương trình có vô số nghiệm.", "Kết quả", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm.", "Kết quả", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
