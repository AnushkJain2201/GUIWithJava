import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
    JLabel l;
    JButton b;
    int count = 0;
    MyFrame(){
        super("Swing Demo");
        l = new JLabel("Number Of Times " + count + " Clicked");
        b = new JButton("Click Here");
        setLayout(new FlowLayout());
        add(l);
        add(b);
        
        b.addActionListener((ActionEvent e)->{
            count++;
            l.setText("Number Of Times "+count+" Clicked");
        });
        getRootPane().setDefaultButton(b);
    }

}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500, 500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}