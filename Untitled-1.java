import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame
        implements MouseListener, MouseMotionListener {

    JLabel label;

    MouseEvents() {
        setTitle("Mouse Events");
        setSize(500, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Perform mouse operations inside the frame");
        add(label);

        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Frame");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Frame");
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved: X = " + e.getX()
                + " Y = " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged: X = " + e.getX()
                + " Y = " + e.getY());
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}