import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.JTextArea;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private int balance = 2000;
	private String accessStatus = "active";
	private String firstName = "Md";
	private String lastName = "Tarikul";
	private JTextField textField_1;
	private JTextField textField_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		contentPane.add(login, "name_38501718251962");
		login.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String accountNumber = textField.getText();
				char[] password = passwordField.getPassword();
				if (isPasswordCorrect (password) && isAccountNumberCorrect(accountNumber))
				{
					JOptionPane.showMessageDialog(null, "Login Successful!", "Success!", JOptionPane.PLAIN_MESSAGE);
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
	                cardLayout.next(contentPane);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(305, 245, 120, 42);
		login.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Account Number:");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 25));
		lblNewLabel.setBounds(95, 84, 190, 40);
		login.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 25));
		lblPassword.setBounds(175, 175, 110, 40);
		login.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(295, 89, 130, 42);
		login.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(295, 175, 130, 42);
		login.add(passwordField);
		
		JPanel menu = new JPanel();
		contentPane.add(menu, "name_38818916861170");
		menu.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_2 = new JButton("Deposit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_43864096638366");
			}
		});
		menu.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("Withdraw");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_43905495437310");
			}
		});
		menu.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("<html><center>Check Balance</center></html>");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_45282423008002");
			}
		});
		menu.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("<html><center>Make a Transfer</center></html>");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_45285226859634");
			}
		});
		menu.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("<html><center>Change Password</center></html>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_45348565015766");
			}
		});
		menu.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_45351186925409");
			}
		});
		menu.add(btnNewButton_1);
		
		JPanel deposit = new JPanel();
		contentPane.add(deposit, "name_43864096638366");
		deposit.setLayout(null);
		
		JPanel withdraw = new JPanel();
		contentPane.add(withdraw, "name_43905495437310");
		withdraw.setLayout(null);
		
		JPanel checkBalance = new JPanel();
		contentPane.add(checkBalance, "name_45282423008002");
		checkBalance.setLayout(null);
		
		JPanel transfer = new JPanel();
		contentPane.add(transfer, "name_45285226859634");
		transfer.setLayout(null); 
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(53, 73, 404, 42);
		textArea.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to deposit:");
		deposit.add(textArea);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(50, 78, 417, 42);
		textArea_1.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to withdraw:");
		withdraw.add(textArea_1);
		
		final JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(107, 96, 290, 23);
		textArea_2.setText("Your current balance is $" + balance + ".");
		checkBalance.add(textArea_2);
		
		final JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(42, 38, 484, 60);
		textArea_3.setText("Your current balance is $" + balance + ".\nPlease enter the account number you want to transfer to and \nthe amount you would like to transfer:");
		transfer.add(textArea_3);
		
		//deposit
		JButton btnNewButton_7 = new JButton("Deposit");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String depositAmmount = textField_1.getText();
					int ammount = Integer.parseInt(depositAmmount);
					balance += ammount;
					textField_1.setText("");
					textArea.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to deposit:");
					textArea_1.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to withdraw:");
					textArea_2.setText("Your current balance is $" + balance + ".");
					textArea_3.setText("Your current balance is $" + balance + ".\nPlease enter the account number you want to transfer to and \nthe amount you would like to transfer:");
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane, "name_38818916861170");
				}
				catch (NumberFormatException e1)
				{
					JOptionPane.showMessageDialog(null, "Please enter an integer.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_7.setBounds(325, 230, 132, 42);
		deposit.add(btnNewButton_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(296, 152, 160, 42);
		deposit.add(textField_1);
		textField_1.setColumns(10);
		
		//withdraw
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					char cont = 'y';
					String withdrawAmmount = textField_2.getText();
					int ammount = Integer.parseInt(withdrawAmmount);
					if (ammount > balance)
					{
						cont = 'n';
						JOptionPane.showMessageDialog(null, "Ammount entered exceeds balance!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (cont == 'y')
					{
						balance = balance - ammount;
						textField_2.setText("");
						textArea.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to deposit:");
						textArea_1.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to withdraw:");
						textArea_2.setText("Your current balance is $" + balance + ".");
						textArea_3.setText("Your current balance is $" + balance + ".\nPlease enter the account number you want to transfer to and \nthe amount you would like to transfer:");
						CardLayout cardLayout = (CardLayout) contentPane.getLayout();
						cardLayout.show(contentPane, "name_38818916861170");
					}
					else
					{
						textField_2.setText("");
						CardLayout cardLayout = (CardLayout) contentPane.getLayout();
						cardLayout.show(contentPane, "name_43905495437310");
					}
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Please enter an integer.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnWithdraw.setBounds(335, 239, 132, 42);
		withdraw.add(btnWithdraw);
		
		textField_2 = new JTextField();
		textField_2.setBounds(307, 160, 160, 42);
		withdraw.add(textField_2);
		textField_2.setColumns(10);
		
		//checkbalance
		JButton btnNewButton_8 = new JButton("Return");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_38818916861170");
			}
		});
		btnNewButton_8.setBounds(306, 220, 132, 42);
		checkBalance.add(btnNewButton_8);
		
		//transfer
		final JTextField textField_3 = new JTextField();
		textField_3.setBounds(325, 122, 132, 42);
		transfer.add(textField_3);
		textField_3.setColumns(10);
		        
		final JTextField textField_4 = new JTextField();
		textField_4.setBounds(325, 187, 132, 42);
		transfer.add(textField_4);
		textField_4.setColumns(10);
		        
		JLabel label1 = new JLabel("Account Number:");
		label1.setFont(new Font("Serif", Font.PLAIN, 20));
		label1.setBounds(155, 120, 160, 38);
		transfer.add(label1);
		        
		JLabel label2 = new JLabel("Amount:");
		label2.setFont(new Font("Serif", Font.PLAIN, 20));
		label2.setBounds(225, 185, 90, 38);
		transfer.add(label2);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					char cont = 'y';
					String TransferAmmount = textField_4.getText();
					int ammount = Integer.parseInt(TransferAmmount);
					if (ammount > balance)
					{
						cont = 'n';
						JOptionPane.showMessageDialog(null, "Ammount entered exceeds balance!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (cont == 'y')
					{
						balance -= ammount;
						textField_3.setText("");
						textField_4.setText("");
						JOptionPane.showMessageDialog(null, "The money has been transferred!");
						textArea.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to deposit:");
						textArea_1.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to withdraw:");
						textArea_2.setText("Your current balance is $" + balance + ".");
						textArea_3.setText("Your current balance is $" + balance + ".\nPlease enter the account number you want to transfer to and \nthe amount you would like to transfer:");
						CardLayout cardLayout = (CardLayout) contentPane.getLayout();
						cardLayout.show(contentPane, "name_38818916861170");
					}
					else
					{
						textField_4.setText("");
						CardLayout cardLayout = (CardLayout) contentPane.getLayout();
						cardLayout.show(contentPane, "name_45285226859634");
					}
				}
				catch (NumberFormatException e1)
				{
					JOptionPane.showMessageDialog(null, "Please enter an integer.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnTransfer.setBounds(326, 259, 133, 42);
		transfer.add(btnTransfer);
		
		//password
		JPanel changePassword = new JPanel();
		contentPane.add(changePassword, "name_45348565015766");
		changePassword.setLayout(null);
        final JTextArea area1 = new JTextArea();
        area1.setBounds(42, 28, 250, 40);
        changePassword.add(area1);
        area1.setText("Change your password by typing in your" + "\n" + "old password and then your new password");
        
        JLabel l1 = new JLabel("Old Password: ");
        l1.setBounds(161, 111, 89, 38);
        changePassword.add(l1);
        final JPasswordField p1 =  new JPasswordField();
        p1.setBounds(250, 111, 150, 38);
        changePassword.add(p1);
        JLabel l2 = new JLabel("New Password: ");
        l2.setBounds(156, 175, 94, 38);
        changePassword.add(l2);
        final JPasswordField p2 = new JPasswordField();
        p2.setBounds(250, 175, 150, 38);
        changePassword.add(p2);
        JLabel l3 = new JLabel("Retype New Password: ");
        l3.setBounds(112, 240, 143, 38);
        changePassword.add(l3);
        final JPasswordField p3 = new JPasswordField();
        p3.setBounds(250, 240, 150, 38);
        changePassword.add(p3);
        
        JButton btnPassword = new JButton("Change");
        btnPassword.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        	{
        		char [] currentPassword = {'s', 'a', 'm', 'p', 'l', 'e', '1', '2', '3'};
        		char [] oldPassword = p1.getPassword();
        		char [] newPassword = p2.getPassword();
        		char [] retype = p3.getPassword();
        		
        		if (!Arrays.equals (oldPassword, currentPassword))
        		{
        			JOptionPane.showMessageDialog(null, "Old Password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
        			CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        			cardLayout.show(contentPane, "name_45348565015766");
        		}
        		else if (!Arrays.equals(newPassword, retype))
        		{
        			JOptionPane.showMessageDialog(null, "Password doesn't match!", "Error",  JOptionPane.ERROR_MESSAGE);
        			CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        			cardLayout.show(contentPane, "name_45348565015766");
        		}
        		else
        		{
        			JOptionPane.showMessageDialog(null, "Password Changed!");
        			CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        			cardLayout.show(contentPane, "name_38818916861170");
        		}
        	}
        });
        btnPassword.setBounds(267, 289, 133, 38);
        changePassword.add(btnPassword);
        
        JButton password = new JButton("Return");
        password.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        		cardLayout.show(contentPane, "name_38818916861170");

        	}
        });
        password.setBounds(435, 297, 89, 23);
        changePassword.add(password);               
        
		
		//logout
		JPanel logout = new JPanel();
		contentPane.add(logout, "name_45351186925409");
		
	}
	private static boolean isPasswordCorrect(char[] input) 
	{
		boolean isCorrect = true;
		char[] correctPassword = {'s', 'a', 'm', 'p', 'l', 'e', '1', '2', '3'};
		
		if (input.length != correctPassword.length) 
		{
			isCorrect = false;
		} 
		else 
		{
			isCorrect = Arrays.equals (input, correctPassword);
		}

		return isCorrect;
	}
	private static boolean isAccountNumberCorrect(String input)
	{
		boolean isCorrect = true;
		int correctAccountNumber = 111;
		int userInput = Integer.parseInt(input);
	
		if (userInput != correctAccountNumber)
		{
			isCorrect = false;
		}
		return isCorrect;
	}
}
