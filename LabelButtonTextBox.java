import javax.swing.*;

public class LabelButtonTextBox {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My Frame");
        JLabel label = new JLabel("Registration No:");
        label.setBounds(50, 50, 120, 30);
        JTextField textBox = new JTextField();
        textBox.setBounds(170, 50, 180, 30);
        JButton button = new JButton("Submit");
        button.setBounds(120, 100, 120, 40);

        frame.add(label);
        frame.add(textBox);
        frame.add(button);

        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}