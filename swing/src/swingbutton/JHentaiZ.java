package swingbutton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JHentaiZ extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToArrive;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JHentaiZ frame = new JHentaiZ();
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
	public JHentaiZ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToArrive = new JTextField();
		txtWelcomeToArrive.setText("https://hentaiz.net");
		txtWelcomeToArrive.setBounds(83, 11, 351, 20);
		contentPane.add(txtWelcomeToArrive);
		txtWelcomeToArrive.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name: ");
		lblNewLabel.setBounds(30, 72, 68, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password: ");
		lblNewLabel_1.setBounds(30, 121, 68, 17);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(124, 72, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 118, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(178, 174, 87, 23);
		contentPane.add(btnNewButton);
	}

}
