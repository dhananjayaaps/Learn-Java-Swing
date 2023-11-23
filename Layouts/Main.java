import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

class MyFrame extends JFrame{

    JButton btn1, btn2, btn3, btn4, btn5;

    MyFrame() {
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");

        // this.setLayout(new BorderLayout());
        // this.add(btn1, BorderLayout.NORTH);
        // this.add(btn2, BorderLayout.SOUTH);
        // this.add(btn3, BorderLayout.EAST);
        // this.add(btn4, BorderLayout.WEST);
        // this.add(btn5, BorderLayout.CENTER);

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        this.setLayout(flowLayout);
        flowLayout.setVgap(60);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
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