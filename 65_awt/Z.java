import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    MyFrame(){
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());

    }
    
}
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
    }
}