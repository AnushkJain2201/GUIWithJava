import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
    int x = 0 , y = 0;
    MyFrame(){
        super("Painting");
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        g.drawOval(x, y, 50, 50);
    }
}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
    }
}