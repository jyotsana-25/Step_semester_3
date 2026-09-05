import javax.swing.*;

public class TextBoxExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Number");

        // Text Field
        JTextField textField = new JTextField("RA2511027010108");
        textField.setBounds(80, 40, 220, 30);

        // Text Area
        JTextArea textArea = new JTextArea("Enter your details here...");
        textArea.setBounds(80, 90, 220, 100);

        // Add components to frame
        frame.add(textField);
        frame.add(textArea);

        // Frame settings
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}