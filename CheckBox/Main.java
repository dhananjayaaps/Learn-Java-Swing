import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;
    JCheckBox check1, check2;

    MyFrame() {
        check1 = new JCheckBox("Bold");
        check2 = new JCheckBox("Italic");

        textField = new JTextField();
        textField.setColumns(20);

        setLayout(new FlowLayout());
        this.add(check1);
        this.add(check2);
        this.add(textField);

        check1.addActionListener(this);
        check2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (check1.isSelected() && check2.isSelected()){
            textField.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 14));
        } else if (check1.isSelected()){
            textField.setFont(new Font("Serif", Font.BOLD, 14));
        } else if (check2.isSelected()){
            textField.setFont(new Font("Serif", Font.ITALIC, 14));
        } else {
            textField.setFont(new Font("Serif", Font.PLAIN, 14));
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