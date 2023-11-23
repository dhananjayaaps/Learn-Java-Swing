import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

class MyFrame extends JFrame implements ActionListener {

    JLabel label;
    JButton incrementButton;
    JButton decrementButton;
    int count = 0;

    MyFrame() {

        incrementButton = new JButton("Increment");
        decrementButton = new JButton("Decrement");
        label = new JLabel();

        label.setText("Count:" + count);

        
        setLayout(new FlowLayout());

        this.add(label);
        this.add(incrementButton);
        this.add(decrementButton);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);

    

        setSize(500, 500);
        setVisible(true);
    
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == incrementButton){
            count++;
            label.setText("Count:" + count);
        }
        else if (e.getSource() == decrementButton){
            count--;
            label.setText("Count:" + count);
        }
        System.out.println(e.getSource());
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