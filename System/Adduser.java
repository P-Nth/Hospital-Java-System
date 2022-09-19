import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;

public class Adduser extends Users implements ActionListener {

    JFrame frame = new JFrame();
    JButton addbtn = new JButton("Add");
    JButton removebtn = new JButton("Remove");
    JButton updatebtn = new JButton("Update");
    JButton done = new JButton("Done");

    JLabel userIdLabel = new JLabel("User Id: ");
    JLabel userNameLabel = new JLabel("Username: ");
    JLabel userPassLabel = new JLabel("Password: ");

    JTextField userIdField = new JTextField();
    JTextField userNameField = new JTextField();
    JPasswordField userPassField = new JPasswordField();

    Collection<Users> table = new ArrayList<Users>();

    // adding new user
    Adduser() {

        JLabel hospital = new JLabel("Makindu Hospital");

        hospital.setBounds(350, 20, 100, 25);

        userIdLabel.setBounds(30, 100, 80, 25);
        userIdField.setBounds(110, 100, 150, 25);

        userNameLabel.setBounds(30, 130, 80, 25);
        userNameField.setBounds(110, 130, 150, 25);

        userPassLabel.setBounds(30, 160, 80, 25);
        userPassField.setBounds(110, 160, 150, 25);

        addbtn.setBounds(50, 200, 90, 30);
        addbtn.setFocusable(false);
        addbtn.addActionListener(this);

        removebtn.setBounds(150, 200, 90, 30);
        removebtn.setFocusable(false);
        removebtn.addActionListener(this);

        updatebtn.setBounds(50, 240, 90, 30);
        updatebtn.setFocusable(false);
        updatebtn.addActionListener(this);

        done.setBounds(150, 240, 90, 30);
        done.setFocusable(false);
        done.addActionListener(this);

        frame.add(hospital);
        frame.add(userIdLabel);
        frame.add(userIdField);
        frame.add(userNameLabel);
        frame.add(userNameField);
        frame.add(userPassLabel);
        frame.add(userPassField);
        frame.add(addbtn);
        frame.add(removebtn);
        frame.add(updatebtn);
        frame.add(done);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addbtn) {
            String id = userIdField.getText();
            String name = userIdField.getText();
            String pass = userIdField.getText();
        }
        if (e.getSource() == removebtn) {
            // removeFromist();
        }
        if (e.getSource() == updatebtn) {
            // updateOnList();
        }
        if (e.getSource() == done) {
            // updateOnList();
        }
    }
}
