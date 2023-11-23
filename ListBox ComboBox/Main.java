import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ListSelectionListener, ActionListener {

    JList listBox;
    JComboBox comboBox;

    MyFrame() {
       String[] animals = {"dog", "cat", "bird", "Lion", "Parrot", "Rabbit"};

        listBox = new JList<>(animals);
        listBox.setVisibleRowCount(4);

        comboBox = new JComboBox<>(animals);

        listBox.addListSelectionListener(this);
        comboBox.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(new JScrollPane(listBox));

        this.add(comboBox);
    }

    public void valueChanged(ListSelectionEvent e){
        if (e.getSource() == listBox) {
            System.out.println(listBox.getSelectedValuesList());
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }

}

class Main {

    public static void main(String[] args) {

        JFrame frame = new MyFrame();
        frame.setTitle("First Application");
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}