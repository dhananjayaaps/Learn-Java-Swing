import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Student {
    private String name;
    private int index;
    private String phon;

    public Student(String name, int index, String phon) {
        this.name = name;
        this.index = index;
        this.phon = phon;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public String getPhon() {
        return phon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

}

class MyFrame extends JFrame implements ActionListener {

    private DefaultListModel<String> studentModel;
    private JList<String> studentList;

    JPanel inpuJPanel, mainPanel, buttonPanel;
    JLabel nameLabel, indexLabel, phonLabel;
    JTextField nameField, indexField, phonField;
    JButton addButton, deleteButton, updateButton, searchButton;

    MyFrame() {

        studentModel = new DefaultListModel<>();
        studentList = new JList<>(studentModel);

        // Student student1 = new Student("Ali", 123, "123456789");
        // studentModel.addElement(toString(student1));

        inpuJPanel = new JPanel(new GridLayout(2, 2));

        nameLabel = new JLabel("Name");
        indexLabel = new JLabel("Index");
        phonLabel = new JLabel("Phone");

        nameField = new JTextField();
        indexField = new JTextField();
        phonField = new JTextField();

        inpuJPanel.add(indexLabel);
        inpuJPanel.add(indexField);
        inpuJPanel.add(nameLabel);
        inpuJPanel.add(nameField);
        inpuJPanel.add(phonLabel);
        inpuJPanel.add(phonField);

        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inpuJPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(studentList), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            int index = Integer.parseInt(indexField.getText());
            String phon = phonField.getText();
            Student student = new Student(name, index, phon);
            studentModel.addElement(toString(student));

            nameField.setText("");
            indexField.setText("");
            phonField.setText("");

        } else if (e.getSource() == deleteButton) {
            int index = studentList.getSelectedIndex();
            if (index != -1) {
                studentModel.removeElementAt(index);
            }
        }
    }

    public String toString(Student student) {
        return student.getName() + " " + student.getIndex() + " " + student.getPhon();
    }

}

class Main {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setTitle("Student Management System");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}