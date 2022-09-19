import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;

public class Login implements ActionListener {

    JFrame frame = new JFrame();
    JLabel name = new JLabel("Makindu Hospital");
    JButton loginbtn = new JButton("Login");
    JButton gobackbtn = new JButton("Go Back");
    JTextField userIDField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserName:");
    JLabel userPassLabel = new JLabel("Password:");
    JLabel userDeptLabel = new JLabel("Department:");
    String[] departments = { "Administration", "Nursing", "Doctors" };
    JComboBox list = new JComboBox(departments);
    JLabel alert = new JLabel();

    // interobject communication
    HashMap<String, String> logindata = new HashMap<String, String>();

    // login constructor
    Login(HashMap<String, String> loginData) {

        logindata = loginData;

        name.setBounds(130, 20, 120, 25);

        userIDLabel.setBounds(50, 100, 75, 25);
        userPassLabel.setBounds(50, 150, 75, 25);
        userDeptLabel.setBounds(50, 200, 75, 25);

        userIDField.setBounds(125, 100, 200, 25);
        userPassField.setBounds(125, 150, 200, 25);

        list.setBounds(125, 200, 200, 25);
        list.addActionListener(this);

        loginbtn.setBounds(120, 250, 100, 25);
        loginbtn.setFocusable(false);
        loginbtn.addActionListener(this);

        gobackbtn.setBounds(225, 250, 100, 25);
        gobackbtn.setFocusable(false);
        gobackbtn.addActionListener(this);

        alert.setBounds(100, 300, 250, 35);
        alert.setFont(new Font(null, Font.ITALIC, 25));

        frame.add(name);
        frame.add(userIDLabel);
        frame.add(userPassLabel);
        frame.add(userIDField);
        frame.add(userPassField);
        frame.add(userDeptLabel);
        frame.add(list);
        frame.add(loginbtn);
        frame.add(gobackbtn);
        frame.add(alert);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == gobackbtn) {
            frame.dispose();
            Prompt previouspage = new Prompt();
        }

        if (e.getSource() == loginbtn) {
            String username = userIDField.getText();
            String department = (String) list.getSelectedItem();
            String password = String.valueOf(userPassField.getPassword());

            if (logindata.containsKey(username)) {
                if (logindata.get(username).equals(password)) {
                    frame.dispose();
                    // interobject communication
                    Dashboard dashboard = new Dashboard(username, department);
                } else {
                    alert.setForeground(Color.red);
                    alert.setText("Wrong Password!");
                }
            } else {
                alert.setForeground(Color.magenta);
                alert.setText("User Doesn't Exist!");
            }

        }
    }
}