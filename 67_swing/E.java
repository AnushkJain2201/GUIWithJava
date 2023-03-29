import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
// import java.util.concurrent.Flow;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame{
    JTextField tf1;
    JFormattedTextField tf2;
    MyFrame(){
        tf1 = new JTextField(15);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        tf2 = new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(0);

        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(15);

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
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