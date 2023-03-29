import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    Button b1 , b2 , b3 , b4 , b5 , b6;
    MyFrame(){
        super("FlowLayout Demo");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
       
       
        add(b1 , BorderLayout.NORTH);
        add(b2 , BorderLayout.EAST);
        add(b3 , BorderLayout.SOUTH);
        add(b4 , BorderLayout.WEST);
        add(b5 , BorderLayout.CENTER);
        // add(b6);
    }
}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true );
    }
}