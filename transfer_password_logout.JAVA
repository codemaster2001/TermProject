//transfer
                JPanel transfer = new JPanel();
                contentPane.add(transfer, "name_45285226859634");
                transfer.setLayout(null);
                final JTextArea textArea_3 = new JTextArea();
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
                
                JButton return1 = new JButton("Return");
		return1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_38818916861170");
				System.out.println(balance);
				
			}
		});
		return1.setBounds(400, 310, 89, 23);
		transfer.add(return1);
                
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
                l1.setBounds(150, 111, 133, 38);
                changePassword.add(l1);
                JPasswordField p1 =  new JPasswordField();
                p1.setBounds(250, 111, 150, 38);
                changePassword.add(p1);
                JLabel l2 = new JLabel("New Password: ");
                l2.setBounds(150, 184, 133, 38);
                changePassword.add(l2);
                final JPasswordField p2 = new JPasswordField();
                p2.setBounds(250, 184, 150, 38);
                changePassword.add(p2);
                JLabel l3 = new JLabel("Retype New Password: ");
                l3.setBounds(110, 246, 150, 38);
                changePassword.add(l3);
                final JPasswordField p3 = new JPasswordField();
                p3.setBounds(250, 246, 150, 38);
                changePassword.add(p3);
                
                JButton btnPassword = new JButton("Change");
                btnPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            char [] newPassword = p2.getPassword();
                            char [] retype = p3.getPassword();
                            if (retype == newPassword){
                                correctPassword  = retype;
                                JOptionPane.showMessageDialog(null, "Password Changed!");
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_38501718251962");                                

                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Password doesn't match!");
                                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                                cardLayout.show(contentPane, "name_45348565015766");
                                
                            }
				
			}
		});
		btnPassword.setBounds(250, 300, 133, 38);
		changePassword.add(btnPassword);
                JButton password = new JButton("Return");
		password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "name_38818916861170");
								
			}
		});
		password.setBounds(400, 310, 89, 23);
		changePassword.add(password);               
                         
		//logout
                
                JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                            cardLayout.show(contentPane, "name_38501718251962");
			}
		});
		menu.add(btnNewButton_1);
		
	}
        char[] correctPassword = {'s', 'a', 'm', 'p', 'l', 'e', '1', '2', '3'};
	private boolean isPasswordCorrect(char[] input) 
	{
		boolean isCorrect = true;
		
		
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
