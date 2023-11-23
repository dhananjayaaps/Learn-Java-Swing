import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{

    JLabel label;
    JButton button;
    JTextField textField;

    MyFrame() {
        textField = new JTextField();
        textField.setColumns(15);
        button = new JButton("Click Me");

        label = new JLabel("Empty field");

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        this.add(label);

        button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            String text = textField.getText();
            label.setText(text);
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