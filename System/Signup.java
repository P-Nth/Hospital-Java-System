import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;

public class Signup implements ActionListener {

    JFrame frame = new JFrame();
    JLabel name = new JLabel("Makindu Hospital");
    JButton registerbtn = new JButton("Register");
    JButton gobackbtn = new JButton("Go Back");
    JTextField userIDField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserName:");
    JLabel userPassLabel = new JLabel("Password:");
    JLabel alert = new JLabel();

    HashMap<String, String> newuserdata = new HashMap<String, String>();

    Signup(HashMap<String, String> newUserData) {

        newuserdata = newUserData;

        name.setBounds(130, 20, 120, 25);

        userIDLabel.setBounds(50, 100, 75, 25);
        userPassLabel.setBounds(50, 150, 75, 25);

        alert.setBounds(100, 250, 250, 55);
        alert.setFont(new Font(null, Font.ITALIC, 15));

        userIDField.setBounds(125, 100, 200, 25);
        userPassField.setBounds(125, 150, 200, 25);

        registerbtn.setBounds(120, 200, 100, 25);
        registerbtn.setFocusable(false);
        registerbtn.addActionListener(this);

        gobackbtn.setBounds(225, 200, 100, 25);
        gobackbtn.setFocusable(false);
        gobackbtn.addActionListener(this);

        frame.add(name);
        frame.add(userIDLabel);
        frame.add(userPassLabel);
        frame.add(userIDField);
        frame.add(userPassField);
        frame.add(registerbtn);
        frame.add(gobackbtn);
        frame.add(alert);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registerbtn) {

            String username = userIDField.getText();
            String password = String.valueOf(userPassField.getPassword());

            if (newuserdata.containsKey(username)) {
                alert.setForeground(Color.red);
                alert.setText("User Already Exists");
            } else if (username == null) {
                alert.setForeground(Color.blue);
                alert.setText("Please fill in all the fields above!");
            } else if (password == null) {
                alert.setForeground(Color.blue);
                alert.setText("Please fill in the password field!");
            } else {
                alert.setForeground(Color.green);
                alert.setText("Registered Succesfully! You'll Be Contacted Shortly");
            }

        }

        if (e.getSource() == gobackbtn) {
            Users sysUsers = new Users();
            frame.dispose();
            Prompt previouspage = new Prompt();
        }
    }
}