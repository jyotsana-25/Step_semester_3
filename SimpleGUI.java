import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame implements ActionListener {

    JLabel label;
    JTextField textField;
    JButton button;

    SimpleGUI() {
        setTitle("Simple GUI");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Enter your name:");
        textField = new JTextField(15);
        button = new JButton("Submit");

        add(label);
        add(textField);
        add(button);

        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        label.setText("Hello " + name);
    }

    public static void main(String[] args) {
        new SimpleGUI();
    }
}