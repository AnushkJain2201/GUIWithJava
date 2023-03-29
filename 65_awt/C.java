import java.awt.*;
class A{
    public static void main(String[] args) {
        Frame fr = new Frame("My First App");
        fr.setLayout(new FlowLayout());
        Button bu = new Button("Ok");
        Label lb = new Label("Name: ");
        TextField tf = new TextField(20);
        fr.add(lb);
        fr.add(tf);
        fr.add(bu);
        fr.setSize(300 , 300); 
        fr.setVisible(true);
    }

}