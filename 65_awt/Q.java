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
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.CENTER);
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true );
    }
}