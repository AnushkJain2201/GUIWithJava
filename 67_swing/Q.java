import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import java.awt.*;
import java.io.File;

import javax.swing.tree.*;
import java.util.StringTokenizer;

class MyFrame extends JFrame implements TreeSelectionListener{
    JTree tree;
    JLabel label;
    MyFrame(){
        super("Tree Node");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\Users\\ASUS\\OneDrive\\Desktop\\CODING\\PRAC\\Codechef JAVA");
        File f = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\CODING\\PRAC\\Codechef JAVA");
        for(File x:f.listFiles()){
            if(x.isDirectory()){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else{
                root.add(new DefaultMutableTreeNode(x.getName()));

            }
        }

        tree = new JTree(root);
        label = new JLabel("No Files Selected");

        JScrollPane sp = new JScrollPane(tree);
        tree.addTreeSelectionListener(this);
        add(sp , BorderLayout.CENTER);
        add(label , BorderLayout.SOUTH);
    }
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(500 , 500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}