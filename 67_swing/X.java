import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.*;
class MyFrame extends JFrame implements ActionListener{
    JToolBar tb;
    JButton b1 , b2 , b3 , b4 , b5 , b6 , b7;
    JTextArea ta;

    MyFrame(){
        super("ToolBar Demo");
        tb = new JToolBar();
        b1 = new JButton(new ImageIcon("open.png"));
        b2 = new JButton(new ImageIcon("new.png"));
        b3 = new JButton(new ImageIcon("save.png"));
        b4 = new JButton(new ImageIcon("split.png"));
        b5 = new JButton(new ImageIcon("close.png"));
        b6 = new JButton(new ImageIcon("cut.png"));
        b7 = new JButton(new ImageIcon("copy.png"));
        
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(b4);
        tb.add(new JToolBar.Separator());
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        add(tb, BorderLayout.NORTH);
        add(sp , BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("Open");
        m2.setMnemonic(KeyEvent.VK_O);
        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);

        setJMenuBar(mb);

        m2.addActionListener(this);
        b2.setActionCommand("open");
        b2.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File f = fc.getSelectedFile();
        try{
            FileInputStream fi = new FileInputStream(f);
            byte []b = new byte[fi.available()];
            fi.read(b);
            String str = new String(b);
            ta.setText(str);
            fi.close();

        } catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}