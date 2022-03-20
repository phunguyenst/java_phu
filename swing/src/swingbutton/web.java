package swingbutton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class web extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					web frame = new web();
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
	public web() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(74, 77, 217, 25);
		contentPane.add(passwordField1);
		
		textField = new JTextField();
		textField.setBounds(74, 30, 217, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel text1 = new JLabel("text field");
		text1.setBounds(10, 35, 47, 14);
		contentPane.add(text1);
		
		JLabel passwordfi = new JLabel("password field");
		passwordfi.setBounds(10, 80, 47, 14);
		contentPane.add(passwordfi);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(120, 177, 47, -45);
		contentPane.add(lblNewLabel);
		
		JLabel ketqua = new JLabel("");
		ketqua.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		ketqua.setBounds(74, 166, 173, 25);
		contentPane.add(ketqua);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = String.valueOf(passwordField1.getPassword());
				ketqua.setText(s1);
			}
		});
		btnNewButton.setBounds(74, 124, 87, 23);
		contentPane.add(btnNewButton);
	}
}
