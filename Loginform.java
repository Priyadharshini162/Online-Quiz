package com.OnlineQuiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame implements ActionListener {
private JLabel lblUsername;
private JLabel lblPassword;
private JTextField txtUsername;
private JPasswordField txtPassword;
private JButton btnLogin;
public LoginForm() {
setTitle("Login Form");
setSize(300, 150);
setDefaultCloseOperation(EXIT_ON_CLOSE);
lblUsername = new JLabel(" Username:");
lblPassword = new JLabel(" Password:");
txtUsername = new JTextField(10);
txtPassword = new JPasswordField(10);
btnLogin = new JButton("LOGIN");
setLayout(new GridLayout(3, 2));
add(lblUsername);
add(txtUsername);
add(lblPassword);
add(txtPassword);
add(new JLabel(""));
add(btnLogin);
btnLogin.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnLogin) {
String username = txtUsername.getText();
String password = new String(txtPassword.getPassword());
if (username.equals("test@gmail.com") && password.equals("000")) {
JOptionPane.showMessageDialog(this, "Login successful!");
} else {
JOptionPane.showMessageDialog(this, "Invalid Credentials!");
}
}
}
public static void main(String[] args) {
LoginForm loginForm = new LoginForm();
loginForm.setVisible(true);
}
}
