import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;

public class Dashboard implements ActionListener {

    JFrame frame = new JFrame();
    // admin
    JButton addNewUser = new JButton("Add User");
    JButton removeUser = new JButton("Remove User");
    JButton updateUser = new JButton("Update Users");
    JButton checkStatus = new JButton("Check Status");
    JButton logoutBtn = new JButton("Logout");
    // nurse
    JButton addNewPatient = new JButton("Add Patient");
    JButton addSession = new JButton("Book Session");
    JButton viewsessions = new JButton("View Sessions");
    JButton viewPatients = new JButton("View Patients");
    JButton updatePatients = new JButton("Update Patients");
    // doctor
    JButton administerDrug = new JButton("Book Session");
    JButton save = new JButton("Save");
    JButton cancel = new JButton("Cancel");
    JButton done = new JButton("Done");

    // Dashboard Constructor
    Dashboard(String username, String department) {
        if (department == "Administration") {
            adminsDash(username);
        } else if (department == "Nursing") {
            nursesDash(username);
        } else {
            docsDash(username);
        }
    }

    // Admin Dashboard
    private void adminsDash(String username) {

        JLabel hospital = new JLabel("Makindu Hospital");
        JLabel welcome = new JLabel("Welcome " + username);
        JLabel userType = new JLabel("User-Type: Administration");
        JLabel status = new JLabel("Status: " + "System Developer");

        hospital.setBounds(250, 20, 120, 25);

        welcome.setForeground(Color.magenta);
        welcome.setBounds(80, 100, 200, 25);
        welcome.setFont(new Font(null, Font.BOLD, 15));

        userType.setBounds(80, 150, 200, 25);
        userType.setFont(new Font(null, Font.BOLD, 12));

        status.setBounds(80, 200, 200, 25);
        status.setFont(new Font(null, Font.BOLD, 12));

        addNewUser.setBounds(370, 100, 150, 30);
        addNewUser.setFocusable(false);
        addNewUser.addActionListener(this);

        removeUser.setBounds(370, 140, 150, 30);
        removeUser.setFocusable(false);
        removeUser.addActionListener(this);

        updateUser.setBounds(370, 180, 150, 30);
        updateUser.setFocusable(false);
        updateUser.addActionListener(this);

        checkStatus.setBounds(370, 220, 150, 30);
        checkStatus.setFocusable(false);
        checkStatus.addActionListener(this);

        logoutBtn.setBounds(370, 260, 150, 30);
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(this);

        frame.add(hospital);
        frame.add(welcome);
        frame.add(userType);
        frame.add(status);
        frame.add(addNewUser);
        frame.add(removeUser);
        frame.add(updateUser);
        frame.add(checkStatus);
        frame.add(logoutBtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    // Nurses Dashboard
    private void nursesDash(String username) {

        JLabel hospital = new JLabel("Makindu Hospital");
        JLabel welcome = new JLabel("Welcome " + username);
        JLabel userType = new JLabel("User-Type: Nursing");
        JLabel status = new JLabel("Status: " + "Accredited Nurse");

        hospital.setBounds(250, 20, 120, 25);

        welcome.setForeground(Color.magenta);
        welcome.setBounds(80, 100, 200, 25);
        welcome.setFont(new Font(null, Font.BOLD, 15));

        userType.setBounds(80, 150, 200, 25);
        userType.setFont(new Font(null, Font.BOLD, 12));

        status.setBounds(80, 200, 200, 25);
        status.setFont(new Font(null, Font.BOLD, 12));

        addNewPatient.setBounds(370, 100, 150, 30);
        addNewPatient.setFocusable(false);
        addNewPatient.addActionListener(this);

        updatePatients.setBounds(370, 140, 150, 30);
        updatePatients.setFocusable(false);
        updatePatients.addActionListener(this);

        viewPatients.setBounds(370, 180, 150, 30);
        viewPatients.setFocusable(false);
        viewPatients.addActionListener(this);

        addSession.setBounds(370, 220, 150, 30);
        addSession.setFocusable(false);
        addSession.addActionListener(this);

        viewsessions.setBounds(370, 260, 150, 30);
        viewsessions.setFocusable(false);
        viewsessions.addActionListener(this);

        checkStatus.setBounds(370, 300, 150, 30);
        checkStatus.setFocusable(false);
        checkStatus.addActionListener(this);

        logoutBtn.setBounds(370, 340, 150, 30);
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(this);

        frame.add(hospital);
        frame.add(welcome);
        frame.add(userType);
        frame.add(status);
        frame.add(addNewPatient);
        frame.add(updatePatients);
        frame.add(viewPatients);
        frame.add(addSession);
        frame.add(viewsessions);
        frame.add(checkStatus);
        frame.add(logoutBtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // Doctors Dashboard
    private void docsDash(String username) {

        JLabel hospital = new JLabel("Makindu Hospital");
        JLabel welcome = new JLabel("Welcome " + username);
        JLabel userType = new JLabel("User-Type: Doctors");
        JLabel status = new JLabel("Status: " + "Certified Sergeon");

        hospital.setBounds(250, 20, 120, 25);

        welcome.setForeground(Color.magenta);
        welcome.setBounds(80, 100, 200, 25);
        welcome.setFont(new Font(null, Font.BOLD, 15));

        userType.setBounds(80, 150, 200, 25);
        userType.setFont(new Font(null, Font.BOLD, 12));

        status.setBounds(80, 200, 200, 25);
        status.setFont(new Font(null, Font.BOLD, 12));

        viewPatients.setBounds(370, 100, 150, 30);
        viewPatients.setFocusable(false);
        viewPatients.addActionListener(this);

        viewsessions.setBounds(370, 140, 150, 30);
        viewsessions.setFocusable(false);
        viewsessions.addActionListener(this);

        checkStatus.setBounds(370, 180, 150, 30);
        checkStatus.setFocusable(false);
        checkStatus.addActionListener(this);

        logoutBtn.setBounds(370, 220, 150, 30);
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(this);

        frame.add(hospital);
        frame.add(welcome);
        frame.add(userType);
        frame.add(status);
        frame.add(viewsessions);
        frame.add(administerDrug);
        frame.add(viewPatients);
        frame.add(checkStatus);
        frame.add(logoutBtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addNewUser) {
            frame.dispose();
            Adduser addnewuser = new Adduser();
        }
        if (e.getSource() == removeUser) {
            frame.dispose();
            // removeUser();
        }
        if (e.getSource() == updateUser) {
            frame.dispose();
            // updateUser(department);
        }
        if (e.getSource() == checkStatus) {
            frame.dispose();
            // checkstatus(username, department);
        }
        if (e.getSource() == addNewPatient) {
            frame.dispose();
            // addNewPatients();
        }
        if (e.getSource() == viewPatients) {
            frame.dispose();
            // viewPatients();
        }
        if (e.getSource() == updatePatients) {
            frame.dispose();
            // updatePatients();
        }
        if (e.getSource() == addSession) {
            frame.dispose();
            // administerDrug();
        }
        if (e.getSource() == viewsessions) {
            frame.dispose();
            // viewsessions();
        }
        if (e.getSource() == administerDrug) {
            frame.dispose();
            // administerDrug();
        }
        if (e.getSource() == logoutBtn) {
            frame.dispose();
            Prompt prompt = new Prompt();
        }
    }
}