import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    public static void main(String[] args) {
        openWindow();
    }
public static void openWindow (){
        JFrame frame = new JFrame();
        GridLayout gridLayout = new GridLayout(3, 3);
        frame.setLayout(gridLayout);
    Buttons buttons = new Buttons(frame);
        frame.setBounds(0,0,500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);










}



}
