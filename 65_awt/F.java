import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    int count = 0;
    Label l;
    Button b;
    MyFrame(){
        super("Button Demo");
        l = new Label("   "+count);
        b = new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);

        
    }
    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("    "+count);
    }
}
class ButtonDemo {
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(400 , 400);
        fr.setVisible(true);
    }
}