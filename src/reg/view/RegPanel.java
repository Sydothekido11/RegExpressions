package reg.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import reg.controller.RegController;
import reg.model.Email;
import reg.model.FirstName;
import reg.model.LastName;
import reg.model.Phone;


public class RegPanel extends JPanel
{
	private RegController baseController;
	private SpringLayout baseLayout;
	
	//text analyzer declaration
	private FirstName firstNameCheck;
	private LastName lastNameCheck;
	private Phone phoneNumberCheck;
	private Email emailNumberCheck;

	// text area declaration
	private JTextArea firstNameText;
	private JTextArea lastNameText;
	private JTextArea phoneNumberText;
	private JTextArea emailText;

	// buttons declaration
	private JButton checkFirstNameButton;
	private JButton checkLastNameButton;
	private JButton checkPhoneNumberButton;
	private JButton checkEmailButton;

	public RegPanel(RegController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		//string analyzer instantiation 
		firstNameCheck = new FirstName();
		lastNameCheck = new LastName();
		phoneNumberCheck = new Phone();
		emailNumberCheck = new Email();

		// Text area instantiation 
		firstNameText = new JTextArea();
		firstNameText.setText("Type your first name");
		
		lastNameText = new JTextArea();
		lastNameText.setText("Type your last name");
		
		phoneNumberText = new JTextArea();
		phoneNumberText.setText("Type your phone number here");

		emailText = new JTextArea();
		emailText.setText("Type your email here");
		
		//buttons instantiation 
		checkFirstNameButton = new JButton();
		checkFirstNameButton.setText("check first name");
		
		checkLastNameButton = new JButton();
		checkLastNameButton.setText("check last name");
		
		
		checkPhoneNumberButton = new JButton();
		checkPhoneNumberButton.setText("check Phone Number");

		checkEmailButton = new JButton();
		checkEmailButton.setText("check email");

		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		// panel stuff
		this.setLayout(baseLayout);
		this.setBackground(Color.PINK);

		// JText area's
		this.add(firstNameText);
		this.add(lastNameText);
		this.add(phoneNumberText);
		this.add(emailText);

		// Buttons
		this.add(checkFirstNameButton);
		this.add(checkLastNameButton);
		this.add(checkPhoneNumberButton);
		this.add(checkEmailButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, checkEmailButton, 153, SpringLayout.EAST, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.EAST, emailText, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, checkLastNameButton, 19, SpringLayout.SOUTH, lastNameText);
		baseLayout.putConstraint(SpringLayout.WEST, checkLastNameButton, 91, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameText, -81, SpringLayout.WEST, phoneNumberText);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameText, 116, SpringLayout.WEST, phoneNumberText);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameText, 9, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstNameText, -89, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberText, 152, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameText, -6, SpringLayout.WEST, phoneNumberText);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberText, 0, SpringLayout.NORTH, firstNameText);
		baseLayout.putConstraint(SpringLayout.EAST, phoneNumberText, -182, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emailText, 0, SpringLayout.NORTH, firstNameText);
		baseLayout.putConstraint(SpringLayout.WEST, emailText, 32, SpringLayout.EAST, phoneNumberText);
		baseLayout.putConstraint(SpringLayout.NORTH, checkFirstNameButton, 30, SpringLayout.SOUTH, firstNameText);
		baseLayout.putConstraint(SpringLayout.WEST, checkFirstNameButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, checkPhoneNumberButton, 0, SpringLayout.NORTH, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.WEST, checkPhoneNumberButton, 9, SpringLayout.EAST, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.NORTH, checkEmailButton, 0, SpringLayout.NORTH, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastNameText, -202, SpringLayout.SOUTH, this);
	}

	private void setupListeners()
	{
		checkFirstNameButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				firstNameCheck.firstNameAnalyzer(firstNameText.getText());
				if(firstNameCheck.equals(false))
				{
					
				}
			}
		});
		
		checkLastNameButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				lastNameCheck.lastNameAnalyzer(lastNameText.getText());
				if(lastNameCheck.equals(false))
				{
					
				}
			}
		});
		
		checkPhoneNumberButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				phoneNumberCheck.phoneNumberAnalyzer(phoneNumberText.getText());
				if(lastNameCheck.equals(false))
				{
					
				}
			}
		});
		
		checkEmailButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				emailNumberCheck.checkEmail(emailText.getText());
				if(emailNumberCheck.equals(false))
				{
					
				}
			}
		});
	}

}
