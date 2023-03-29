import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1 , c2 , c3;
    CheckboxGroup chb;
    MyFrame(){
        super("CheckBox Demo");
        l = new Label("Nothing Is Selected");
        chb = new CheckboxGroup();
        c1 = new Checkbox("Java" , false , chb);
        c2 = new Checkbox("Python" , false , chb);
        c3 = new Checkbox("C++" , false , chb);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);

    }
    
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if(c1.getState()){
            str = str + " " + c1.getLabel();
        } 
        if(c2.getState()){
            str = str + " " + c2.getLabel();
        } 
        if(c3.getState()){
            str = str + " " + c3.getLabel();
        } 
        if(str.isEmpty()){
            str="Nothing Is Selected";
        }
        l.setText(str);
    }
}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(400 , 400);
        fr.setVisible(true);

    }
}