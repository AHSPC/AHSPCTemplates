package AHSPCTemplates;

import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  

public class Window {
    private JFrame frame;
    private JPanel panel;

    public Window(int x, int y) {
        frame = new JFrame("JFrame Example");  
        panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        frame.add(panel);  
        frame.setSize(x, y);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }

    public void addButton(String text) {
        panel.add(new JButton(text));
    }

    public void addLabel(String text) {
        panel.add(new JLabel(text));
    }
}
