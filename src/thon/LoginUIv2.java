/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author gbr5023
 *
 */
public class LoginUIv2 extends JFrame implements ActionListener
{
	JFrame loginFrame;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private JButton submitButton;
	private JButton exitButton;
        private JPanel textFieldPanel;
        private JPanel buttonPanel;
	GridBagConstraints layoutConst; //layout manager
	private LoginCntl theLoginCntl;
	
	public LoginUIv2(LoginCntl parentLoginCntl)
	{
                theLoginCntl = parentLoginCntl;
                setTheLayout();
	}
	
	private void setTheLayout()
	{   
            usernameLabel = new JLabel("Username");
            passwordLabel = new JLabel("Password");
            usernameTextField = new JTextField(15);
            passwordField = new JPasswordField(15);
            submitButton = new JButton("Submit");
            exitButton = new JButton("Exit");
              
            usernameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
            passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18));
            usernameTextField.setFont(new Font("Arial", Font.PLAIN, 18));
            passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
            submitButton.setFont(new Font("Arial", Font.PLAIN, 18));
            exitButton.setFont(new Font("Arial", Font.PLAIN, 18));
            
            usernameTextField.setPreferredSize(new Dimension(50,30));
            passwordField.setPreferredSize(new Dimension(50, 30));
            submitButton.setPreferredSize(new Dimension(90, 30));
            exitButton.setPreferredSize(new Dimension(90, 30));
            
            textFieldPanel = new JPanel(new FlowLayout());
            textFieldPanel.add(usernameLabel);    
            textFieldPanel.add(usernameTextField);            
                usernameTextField.setEditable(true);
                    usernameTextField.addActionListener(new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent evt) 
                        {
                            usernameTextFieldActionPerformed(evt);
                        }
                    });	
            textFieldPanel.add(passwordLabel);       
            textFieldPanel.add(passwordField);
                passwordField.setEditable(true);
                    passwordField.addActionListener(new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent evt) 
                        {
                            passwordFieldActionPerformed(evt);
                        }
                    });
            textFieldPanel.setLayout(new FlowLayout());
            textFieldPanel.setSize(new Dimension(500, 500));       
                    
            buttonPanel = new JPanel();
            buttonPanel.add(submitButton); 
                submitButton.addActionListener(new ActionListener() 
                {
                    @Override
                    public void actionPerformed(ActionEvent evt) 
                    {
                        submitButtonActionPerformed(evt);
                    }
                }); 
            buttonPanel.add(exitButton);
                exitButton.addActionListener(new ActionListener() 
                {
                    @Override
                    public void actionPerformed(ActionEvent evt) 
                    {
                            exitButtonActionPerformed(evt);
                    }
                });
                
            buttonPanel.setLayout(new FlowLayout());
            buttonPanel.setSize(new Dimension(500, 500));
            
            loginFrame = new JFrame("Login");    
            loginFrame.add(textFieldPanel);
            loginFrame.add(buttonPanel, BorderLayout.PAGE_END);
            
            //loginFrame.getContentPane().setBackground(Color.yellow);
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);		
	}

	private void usernameTextFieldActionPerformed(ActionEvent evt) 
        {                                                  
        // TODO add your handling code here:
        }
        
        private void submitButtonActionPerformed(ActionEvent evt) 
        {                                             
        // TODO add your handling code here:
            String username = this.usernameTextField.getText();
            char[] password = this.passwordField.getPassword();
        
            boolean authenticated = this.theLoginCntl.requestAuthenticate(username, password);
            boolean submitSelected = submitButton.isSelected();
        
            if(authenticated)
            {
                loginFrame.setVisible(false);
                loginFrame.dispose();
                System.out.println("Authenticated.");
                this.theLoginCntl.requestNavigationCntl();
            }
            else
            {
                System.out.println("NOT Authenticated.");
                System.err.println("Please enter existing username and password.");
            }
        } 
        
        private void exitButtonActionPerformed(ActionEvent evt) 
        {                                             
            System.exit(0);
        }                                            

        private void passwordFieldActionPerformed(ActionEvent evt) 
        {                                              
            
        }

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }   
}
