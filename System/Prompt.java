import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Prompt implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginbtn = new JButton("Login");
    JButton signupbtn = new JButton("SignUp");
    JLabel name = new JLabel("Makindu Hospital");

    Prompt() {

        name.setBounds(150, 50, 120, 25);

        loginbtn.setBounds(90, 150, 100, 35);
        loginbtn.setFocusable(false);
        loginbtn.addActionListener(this);

        signupbtn.setBounds(195, 150, 100, 35);
        signupbtn.setFocusable(false);
        signupbtn.addActionListener(this);

        frame.add(name);
        frame.add(loginbtn);
        frame.add(signupbtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Prompt user to signup
        if (e.getSource() == signupbtn) {
            Users sysUsers = new Users();
            frame.dispose();
            Signup signuppage = new Signup(sysUsers.getSystemUsers());
        }

        // Prompt user to login
        if (e.getSource() == loginbtn) {
            Users sysUsers = new Users();
            frame.dispose();
            Login loginprompt = new Login(sysUsers.getSystemUsers());
        }
    }
}
