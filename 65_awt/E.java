import java.awt.*;
  

class A extends Frame{
    Label l;
    TextField tf;
    Button b;
    public A(){
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(55);
        b = new Button("OK");
        add(l);
        add(tf);
        add(b);

    }
    public static void main(String[] args) {
        A fr = new A();
        fr.setSize(300 , 300);
        fr.setVisible(true);
    }
}