import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    TextArea ta ;
    TextField tf;
    Label l;
    Button b;
    MyFrame(){
        super("TextArea Demo");
        l = new Label("No text entered");
        ta = new TextArea(20 , 30);

        tf = new TextField(20);
        b = new Button("Click");
        Handler h = new Handler();
        b.addActionListener(h);
        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
    }

    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            ta.getSelectedText();
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