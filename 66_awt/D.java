import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    Menu file,sub;
    MenuItem open , save , close , closeall;
    CheckboxMenuItem auto;
    TextField tf;
    MyFrame(){
        super("Menu Demo");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("Close All");

        auto = new CheckboxMenuItem("Auto Save");

        file = new Menu("File");
        sub = new Menu("Close");
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeall);

        MenuBar mb = new MenuBar();
        mb.add(file);

        setMenuBar(mb);

        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent e) -> tf.setText("Open"));
        save.addActionListener((ActionEvent e) -> tf.setText("Save"));
        close.addActionListener((ActionEvent e) -> tf.setText("Close"));
        closeall.addActionListener((ActionEvent e) -> tf.setText("Close All"));

        auto.addItemListener((ItemEvent e) -> {
            if(auto.getState()){
                tf.setText("AutoSave On");
            }
            else{
                tf.setText("AutoSave Off");
            }
        });
    }


}
class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}