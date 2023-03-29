import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
class MyFrame extends Frame{
    TextField tf;
    Button b;
    int count = 0;
    MyFrame(){
        super("Event Demo");
        tf = new TextField("0" , 20);
        b = new Button("Click");
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener(new Handler());
    }
    class Handler implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
           count++;
           tf.setText(String.valueOf(count));
        }
        
    }
}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
    }
}