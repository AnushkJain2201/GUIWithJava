import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    Label l1 , l2;
    TextField tf;
    
    MyFrame(){
        super("Text FIeld DEmo");
        l1 = new Label("No Text is entered Yet");
        l2 = new Label("Enter Key is not yeh hit");  
        tf = new TextField(20);
        Handler h = new Handler(); 
        tf.addTextListener(h);
        tf.addActionListener(h);
        tf.setEchoChar('*');
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    
    

    class Handler implements ActionListener , TextListener{
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
            
        }
    
        
        public void textValueChanged(TextEvent e) {
            
           l1.setText(tf.getText());
        }
    }

    
}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(400 , 400);
        fr.setVisible(true );
    }
}