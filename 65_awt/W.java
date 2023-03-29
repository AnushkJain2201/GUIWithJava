import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener{
    Label l;
    MyFrame(){
        super("Window Event Demo");
        l = new Label("                        ");
        addWindowListener(this);
        setLayout(new FlowLayout());
        add(l);
    }
    
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }
    
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
        
    }
    
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
        
        
    }
    
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
        
    }
    
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
        
    }
    
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
        
    }
    
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
        
    }
}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
    }
}