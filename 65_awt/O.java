import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener , ActionListener{
    List l;
    Choice c;
    TextArea ta;
    MyFrame(){
        super("Listbox Demo");
        l = new List(4 , true);
        c = new Choice();
        ta = new TextArea(20 , 30);
        l.add("Monday");
        l.add("Turesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);

        l.addActionListener(this);
        
    }
    
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == l){
            ta.setText(l.getSelectedItem());

        }
        else{
            ta.setText(c.getSelectedItem());
        }
    }

    
    public void actionPerformed(ActionEvent e) {
        String list[] = l.getSelectedItems();
        String txt = "";
        for(String x : list){
            txt += x + "\n";
            ta.setText(txt);
        }
        
    }
}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(400 , 400);
        fr.setVisible(true);
    }
}