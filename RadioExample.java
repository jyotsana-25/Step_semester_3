import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Gender");

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
    

