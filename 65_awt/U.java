import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
class MyFrame extends Frame implements KeyListener{
    Label l1 , l2 , l3 , l4;
    Date dt;
    MyFrame(){
        super("KeyEvent Demo");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);
        l1.setBounds(30 , 40 , 100 , 20);
        l2.setBounds(30 , 70 , 100 , 20);
        l3.setBounds(30 , 90 , 100 , 20);
        l4.setBounds(30 , 130 , 400 , 20);
        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
        
    }
    public void keyTyped(KeyEvent e) {
        l3.setText("Key Typed");
        l4.setText(new Date(e.getWhen())+"");
    }
    
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
        l2.setText("");
        
    }
    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
        
        
    }
}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(400 , 400);
        fr.setVisible(true);
    }
}