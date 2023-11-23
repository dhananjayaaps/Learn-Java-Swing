import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.concurrent.Flow;

class MyFrame extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JMenu filMenu, helpMenu;
    JMenuItem newItem, openItem, exitItem;

    MyFrame() {
        menuBar = new JMenuBar();

        filMenu = new JMenu("File");
        helpMenu = new JMenu("Help");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);

        filMenu.setMnemonic(KeyEvent.VK_F); // Alt + F
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H

        newItem.setMnemonic(KeyEvent.VK_N);
        openItem.setMnemonic(KeyEvent.VK_O);
        exitItem.setMnemonic(KeyEvent.VK_E);

        filMenu.add(newItem);
        filMenu.addSeparator();
        filMenu.add(openItem);
        filMenu.addSeparator();
        filMenu.add(exitItem);

        menuBar.add(filMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == newItem){
            System.out.println("New Item Clicked");
        }
        else if(e.getSource() == openItem){
            System.out.println("Open Item Clicked");
        }
        else if(e.getSource() == exitItem){
            System.out.println("Exit Item Clicked");
            System.exit(0);
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