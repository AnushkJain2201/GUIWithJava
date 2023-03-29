import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class MyFrame extends JFrame implements ChangeListener
{
    JSlider sl;
    JPanel p1,p2;
    JProgressBar pb;
    
    int w=50;

    MyFrame()
    {
        sl=new JSlider(0,100,50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        
        pb=new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);
       // pb.setIndeterminate(true);
        
        p1=new JPanel(){
            public void paintComponent(Graphics g)
            {
                g.drawOval(200, 200, w, w);
            }
        };
        
        p2=new JPanel();
        p2.add(pb);
        add(sl,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        
        sl.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) 
    {
        w=sl.getValue();
        p1.repaint();
        pb.setString(w+"%");
        pb.setStringPainted(true);
        pb.setValue(w);
       
    }
    
}

class A
{
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
