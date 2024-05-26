package com.OnlineQuiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RegistrationForm extends JFrame implements ActionListener {
private JLabel lblName;
private JLabel lblEmail;
private JLabel lblPassword;
private JTextField txtName;
private JTextField txtEmail;
private JPasswordField txtPassword;
private JButton btnRegister;
public RegistrationForm() {
setTitle("Registration Form");
setSize(300, 200);
setDefaultCloseOperation(EXIT_ON_CLOSE);
lblName = new JLabel(" Name:");
lblEmail = new JLabel(" Email:");
lblPassword = new JLabel(" Password:");
txtName = new JTextField(20);
txtEmail = new JTextField(20);
txtPassword = new JPasswordField(20);
btnRegister = new JButton("Register");
setLayout(new GridLayout(4, 2));
add(lblName);
add(txtName);
add(lblEmail);
add(txtEmail);
add(lblPassword);
add(txtPassword);
add(new JLabel(""));
add(btnRegister);
btnRegister.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnRegister) {
String name = txtName.getText();
String email = txtEmail.getText();
String password = new String(txtPassword.getPassword());
JOptionPane.showMessageDialog(this, "Registration successful!\nName: " + name + "\nEmail: " +
email);
}
}
public static void main(String[] args) {
RegistrationForm registrationForm = new RegistrationForm();
registrationForm.setVisible(true);
}
}
