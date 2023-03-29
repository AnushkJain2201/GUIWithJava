import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener , MouseMotionListener{
    
    Label l  , l2;
    MyFrame(){
        super("Mouse Event Demo");
        l = new Label("");
        l2 = new Label("");
        setLayout(null);
        l.setBounds(30 , 50 , 100 , 20);
        l2.setBounds(30 , 80 , 100 , 20);
        add(l);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }
   
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");
    }
   
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved");
        l2.setText("(" + e.getX() + "," + e.getY() + ")");
    }
    
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    
    public void mouseReleased(MouseEvent e) {
       l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }


}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
    }
}