import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {

    JRadioButton rb1, rb2, rb3;
    JLabel label;

    MyFrame() {
        ButtonGroup group = new ButtonGroup();
        rb1 = new JRadioButton("Orange");
        rb2 = new JRadioButton("Apple");
        rb3 = new JRadioButton("Mango");
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        label = new JLabel("Select your favourite fruit");

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        setLayout(new FlowLayout());
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rb1) {
            label.setText("Orange is selected");
            label.setText(rb1.getText());
        } else if (e.getSource() == rb2) {
            label.setText("Apple is selected");
        } else if (e.getSource() == rb3) {
            label.setText("Mango is selected");
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