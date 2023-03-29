import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
class MyFrame extends JFrame{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    MyFrame(){
        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("Ok");
        p = new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED) , "Login" , TitledBorder.ABOVE_TOP , TitledBorder.LEFT);
        p.setBorder(br);
        setLayout(new FlowLayout());
        add(p);
    }
}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}