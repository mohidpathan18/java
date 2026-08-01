import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentResumeForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Resume Form - Pathan Mohid SY102");
        frame.setSize(500, 650);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 25);
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 70, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 70, 200, 25);
        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(30, 110, 100, 25);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 110, 200, 25);
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 150, 100, 25);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 150, 80, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 150, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(30, 190, 100, 25);
        String courses[] = {"BSc CS", "BCA", "BCom", "BA"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 190, 200, 25);
        JLabel skillLabel = new JLabel("Skills:");
        skillLabel.setBounds(30, 230, 100, 25);
        JCheckBox java = new JCheckBox("Java");
        java.setBounds(150, 230, 80, 25);
        JCheckBox python = new JCheckBox("Python");
        python.setBounds(230, 230, 80, 25);
        JCheckBox web = new JCheckBox("Web Dev");
        web.setBounds(310, 230, 100, 25);
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(30, 270, 100, 25);
        JTextArea addressArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(addressArea);
        scroll.setBounds(150, 270, 200, 80);
        JButton submit = new JButton("Submit");
        submit.setBounds(150, 380, 100, 30);
        JTextArea output = new JTextArea();
        JScrollPane outScroll = new JScrollPane(output);
        outScroll.setBounds(30, 430, 420, 150);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String gender = "";
                if (male.isSelected()) gender = "Male";
                if (female.isSelected()) gender = "Female";
                String course = courseBox.getSelectedItem().toString();
                String skills = "";
                if (java.isSelected()) skills += "Java ";
                if (python.isSelected()) skills += "Python ";
                if (web.isSelected()) skills += "Web Dev ";
                String address = addressArea.getText();
                output.setText(
                        "----- Student Resume -----\n" +
                        "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Phone: " + phone + "\n" +
                        "Gender: " + gender + "\n" +
                        "Course: " + course + "\n" +
                        "Skills: " + skills + "\n" +
                        "Address: " + address
                );
            }
        });
        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(phoneLabel); frame.add(phoneField);
        frame.add(genderLabel); frame.add(male); frame.add(female);
        frame.add(courseLabel); frame.add(courseBox);
        frame.add(skillLabel); frame.add(java); frame.add(python); frame.add(web);
        frame.add(addressLabel); frame.add(scroll);
        frame.add(submit);
        frame.add(outScroll);
        frame.setVisible(true);
    }
}