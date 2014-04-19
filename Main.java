import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
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
					System.out.println("Success");
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
	                cardLayout.next(contentPane);
				}
			}
		});
		btnNewButton.setBounds(305, 245, 120, 40);
		login.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Account Number:");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 25));
		lblNewLabel.setBounds(95, 83, 190, 40);
		login.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 25));
		lblPassword.setBounds(175, 175, 110, 40);
		login.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(295, 89, 130, 40);
		login.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(295, 175, 130, 40);
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
			}
		});
		menu.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("<html><center>Change Password</center></html>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menu.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menu.add(btnNewButton_1);
		
		//deposit
		JPanel deposit = new JPanel();
		contentPane.add(deposit, "name_43864096638366");
		deposit.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(52, 68, 404, 46);
		textArea.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to deposit:");
		deposit.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(286, 152, 170, 40);
		deposit.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Deposit");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String depositAmmount = textField_1.getText();
				int ammount = Integer.parseInt(depositAmmount);
				balance += ammount;
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_38818916861170");;
			}
		});
		btnNewButton_7.setBounds(325, 235, 131, 46);
		deposit.add(btnNewButton_7);
		
		//withdraw
		JPanel withdraw = new JPanel();
		contentPane.add(withdraw, "name_43905495437310");
		withdraw.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(42, 88, 423, 45);
		textArea_1.setText("Your current balance is $" + balance + ".\nPlease enter the amount you would like to withdraw:");
		withdraw.add(textArea_1);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(326, 257, 133, 38);
		withdraw.add(btnWithdraw);
		
		textField_2 = new JTextField();
		textField_2.setBounds(326, 184, 133, 38);
		withdraw.add(textField_2);
		textField_2.setColumns(10);
		
		//checkbalance
		JPanel checkBalance = new JPanel();
		contentPane.add(checkBalance, "name_45282423008002");
		checkBalance.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("Return");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_38818916861170");
				System.out.println(balance);
				
			}
		});
		btnNewButton_8.setBounds(346, 237, 89, 23);
		checkBalance.add(btnNewButton_8);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(107, 96, 250, 23);
		textArea_2.setText("Your current balance is $" + balance + ".");
		checkBalance.add(textArea_2);
		
		//transfer
		JPanel transfer = new JPanel();
		contentPane.add(transfer, "name_45285226859634");
		//password
		JPanel changePassword = new JPanel();
		contentPane.add(changePassword, "name_45348565015766");
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
