import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Score extends JFrame implements ActionListener {
Score(String username, int score) {
setBounds(600, 150, 750, 550);
getContentPane().setBackground(Color.WHITE);
setLayout(null);

JLabel l2 = new JLabel("Thankyou " + username + " for Playing Simple Minds");
l2.setBounds(45, 30, 700, 30);
l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
add(l2);
JLabel l3 = new JLabel("Your Score is " + score);
l3.setBounds(350, 200, 300, 30);
l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
l3.setForeground(new Color(199, 21, 133));
add(l3);
JButton b1 = new JButton("Play Again");
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
b1.setBounds(400, 270, 120, 30);
add(b1);
}
public void actionPerformed(ActionEvent ae) {
this.setVisible(false);
new Test("User");
}
public static void main(String[] args) {
new Score("", 0).setVisible(true);
}
}