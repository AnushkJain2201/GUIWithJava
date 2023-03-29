import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
    int x = 0 , y = 0;
    MyFrame(){
        super("Painting");
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e){
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Hello", x, y);
    }
}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
    }
}