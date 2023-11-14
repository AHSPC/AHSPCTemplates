package JavaApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExampleApp {
    JFrame frame;
    JPanel panel;

    public void run() {
        JLabel label = new JLabel("Label text");
        label.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 30));

        JButton button = new JButton("Button Text");
        button.setFont(new Font(Font.DIALOG, Font.BOLD, 24));
        button.addActionListener(e -> {
            // Stuff to do when the button is pressed
            panel.setBackground(Color.RED);
        });

        JTextField textField = new JTextField("test");
        textField.setMargin(new Insets(5, 5, 5, 5));
        textField.addActionListener(e -> {
           // Every time we type, this gets run.
           // Maybe we can update the label dynamically this way??
           label.setText(textField.getText()); 
        });

        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.setBackground(Color.BLUE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ExampleApp app = new ExampleApp();
        app.run();
    }

    public ExampleApp() {
        frame = new JFrame("Java Example App");  
        panel = new JPanel();  
        panel.setLayout(new FlowLayout());
        frame.setSize(1600, 900);  
        frame.add(panel);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
}