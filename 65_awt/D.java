import java.awt.*;
class MyFrame extends Frame
{
    Label l;
    TextField tf;
    Button b;
    public MyFrame(){
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(55);
        b = new Button("OK");
        add(l);
        add(tf);
        add(b);

    }

}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(300 , 300);
        fr.setVisible(true);
    }
}