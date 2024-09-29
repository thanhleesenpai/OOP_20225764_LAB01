import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        // Danh sách tháng hợp lệ
        List<String> validMonths = Arrays.asList(
                "January", "Jan.", "Jan", "1",
                "February", "Feb.", "Feb", "2",
                "March", "Mar.", "Mar", "3",
                "April", "Apr.", "Apr", "4",
                "May", "5",
                "June", "Jun", "6",
                "July", "Jul", "7",
                "August", "Aug.", "Aug", "8",
                "September", "Sep.", "Sep", "9",
                "October", "Oct.", "Oct", "10",
                "November", "Nov.", "Nov", "11",
                "December", "Dec.", "Dec", "12"
        );

        String monthInput = "";
        int year = -1;

        //nhập tháng hợp lệ
        while (true) {
            monthInput = JOptionPane.showInputDialog(null, "Nhập tháng (ví dụ: January, Jan., Jan, 1):", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
            if (validMonths.contains(monthInput)) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Tháng không hợp lệ! Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        //nhập năm hợp lệ
        while (true) {
            try {
                String yearInput = JOptionPane.showInputDialog(null, "Nhập năm (dạng số nguyên không âm, ví dụ: 1999):", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
                year = Integer.parseInt(yearInput);
                if (year >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                // không nhập đúng
                JOptionPane.showMessageDialog(null, "Năm không hợp lệ! Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }

        int days = getDaysInMonth(monthInput, year);

        JOptionPane.showMessageDialog(null, "Tháng " + monthInput + " năm " + year + " có " + days + " ngày.", "Kết quả", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int getDaysInMonth(String monthInput, int year) {
        switch (monthInput) {
            case "January": case "Jan.": case "Jan": case "1":
                return 31;
            case "February": case "Feb.": case "Feb": case "2":
                return isLeapYear(year) ? 29 : 28; // 28 hoặc 29 ngày
            case "March": case "Mar.": case "Mar": case "3":
                return 31;
            case "April": case "Apr.": case "Apr": case "4":
                return 30;
            case "May": case "5":
                return 31;
            case "June": case "Jun": case "6":
                return 30;
            case "July": case "Jul": case "7":
                return 31;
            case "August": case "Aug.": case "Aug": case "8":
                return 31;
            case "September": case "Sep.": case "Sep": case "9":
                return 30;
            case "October": case "Oct.": case "Oct": case "10":
                return 31;
            case "November": case "Nov.": case "Nov": case "11":
                return 30;
            case "December": case "Dec.": case "Dec": case "12":
                return 31;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
