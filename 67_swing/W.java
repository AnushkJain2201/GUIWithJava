import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener , ListSelectionListener , ChangeListener{
    JComboBox cb;
    JList list;
    JSpinner sp1 , sp2;
    JTextField tf;

    MyFrame(){
        super("ComboBox , List , Spinner");

        String []countries = {"India" , "US" , "UK" , "Canada" , "Australia"};
        String []months = {"January", "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
        String []days = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"}; 

        cb = new JComboBox<>(countries);
        list = new JList<>(months);
        tf = new JTextField(15);

        sp1 = new JSpinner(new SpinnerNumberModel(1 ,1 ,  31 , 1));
        sp2 = new JSpinner(new SpinnerListModel(days));
        

        setLayout(new FlowLayout());

        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);

        cb.addActionListener(this);
        list.addListSelectionListener(this);

        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText((String)list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == sp1){
            tf.setText(sp1.getValue()+"");
        }
        else{
            tf.setText((String)sp2.getValue());
        }
    }

}

class A{
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(800 , 800);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}