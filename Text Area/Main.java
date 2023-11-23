import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JTextArea textArea;

    MyFrame() {
        textArea = new JTextArea(10, 40);
        button = new JButton("Add Text");
        this.setLayout(new FlowLayout());

        this.add(textArea);
        this.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            // System.out.println(textArea.getSelectedText()); // get selected text
            // System.out.println(textArea.getText()); // get all text
            // textArea.append("Hello"); // add text, append to the end
            // textArea.insert("Hello", 0); // Add to the index
            textArea.insert("Hello", textArea.getCaretPosition()); //Add to the caret position
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