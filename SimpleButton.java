import javax.swing.* ;

class SimpleButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("checkbox");
        JCheckBox c1 = new JCheckBox("java");
        JCheckBox c2 = new JCheckBox("python");

        f.add(c1);
        f.add(c2);
        f.setSize(100,200);
        f.setLayout(null);
        f.setVisible(true);
    }

}
