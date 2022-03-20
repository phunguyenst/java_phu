package swingbutton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class demo2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo2 frame = new demo2();
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
	public demo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lable1 = new JLabel("so 1");
		lable1.setBounds(21, 37, 47, 14);
		contentPane.add(lable1);
		
		JLabel lable2 = new JLabel("so 2");
		lable2.setBounds(21, 77, 47, 14);
		contentPane.add(lable2);
		
		textField = new JTextField();
		textField.setBounds(42, 34, 26, -3);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 34, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 74, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textketqua = new JTextField();
		textketqua.setEditable(false);
		textketqua.setBounds(78, 128, 96, 20);
		contentPane.add(textketqua);
		textketqua.setColumns(10);
		
		JButton buttoncong = new JButton("+");
		buttoncong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lay kieu du lieu nguoi nhap vao
				String s1 = textField_1.getText();
				String s2 = textField_2.getText();
				//ep kieu tinh toan
				double so1 = Double.parseDouble(s1);
				double so2 = Double.parseDouble(s2);
				
				double s = so1+ so2;
				String s3 = String.valueOf(s);
				textketqua.setText(s3);
			}
		});
		buttoncong.setBounds(108, 175, 96, 20);
		contentPane.add(buttoncong);
	}
}
