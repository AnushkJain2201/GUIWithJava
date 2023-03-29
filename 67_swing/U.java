import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.color.*;

class MyFrame extends JFrame implements ListSelectionListener{
    JSplitPane jp;
    JList list;
    JLabel lbl;

    MyFrame(){
        super("Split Demo");
        String []cols = {"RED" , "GREEN" , "BLUE" , "YELLOW" , "MAGENTA" , "ORANGE" , "BLACK"};
        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(list);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);

        JScrollPane p2 = new JScrollPane(lbl);

        // jp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT , p1 , p2);
        // jp.setDividerLocation(200);
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Colors" , p1);
        tp.addTab("Label", p2);
        add(tp);


    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String)list.getSelectedValue();
        switch(str){
            case "RED": lbl.setBackground(Color.red); 
            break;
            case "GREEN": lbl.setBackground(Color.green); 
            break;
            case "BLUE": lbl.setBackground(Color.blue); 
            break;
            case "YELLOW": lbl.setBackground(Color.yellow); 
            break;
            case "MAGENTA": lbl.setBackground(Color.magenta); 
            break;
            case "ORANGE": lbl.setBackground(Color.orange); 
            break;
            case "BLACK": lbl.setBackground(Color.black); 
            break;
            
        }
    }

}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(800, 800);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}