package swingbutton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUser;
	private JTextField textFieldpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labeluser = new JLabel("User");
		labeluser.setBounds(24, 11, 83, 27);
		contentPane.add(labeluser);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(24, 58, 83, 27);
		contentPane.add(labelPassword);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(128, 14, 183, 20);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		textFieldpass = new JTextField();
		textFieldpass.setBounds(128, 61, 183, 20);
		contentPane.add(textFieldpass);
		textFieldpass.setColumns(10);
		
		JLabel LabelgetInfo = new JLabel("");
		LabelgetInfo.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		LabelgetInfo.setBounds(109, 147, 166, 27);
		contentPane.add(LabelgetInfo);
		
		JButton btnSelect = new JButton("SELECT");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textFieldUser.getText();
				String s2 = textFieldpass.getText();
				
				if(s1.equals("phu") && s2.equals("123"))
				{
					LabelgetInfo.setText("Valid");
				}
				else
					LabelgetInfo.setText("bê đê ko cho vào");
			}
		});
		btnSelect.setBounds(117, 104, 87, 23);
		contentPane.add(btnSelect);
	}

}
