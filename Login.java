/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.login;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

   
    public Login() {
        
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

      
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField(15);

      
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField(15);

      
        JButton loginButton = new JButton("Login");

     
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

             
                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });
        
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passwordLabel);
        frame.add(passwordText);
        frame.add(loginButton);     
        frame.setVisible(true);
    }

 
    public static void main(String[] args) {
       
        new Login();
    }
}

