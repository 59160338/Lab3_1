import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        //JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.ERROR_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"รักหรือป่าว","ถามเธอ",JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null,"รักน้ะ");
        }else {
            JOptionPane.showMessageDialog(null,"จำไว้เลย");
        }

    }
}
