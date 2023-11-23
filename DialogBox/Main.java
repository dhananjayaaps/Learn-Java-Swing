import javax.swing.*;

class Main {

    public static void main(String[] args) {

        // String name = JOptionPane.showInputDialog("Enter your name:");
        // System.out.println("Hello " + name);

        // if (name != null) {
        //     JOptionPane.showMessageDialog(null, "Hello " + name);
        // }

        // JOptionPane.showMessageDialog(null, "Hello " + name, "Hello", JOptionPane.INFORMATION_MESSAGE);

        int result = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        System.out.println(result);
    }

}