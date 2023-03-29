import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    MyFrame(){
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter(){
            public void WindowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
    
}


class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
    }
}