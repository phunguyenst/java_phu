package swingbutton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class demo1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo1 frame = new demo1();
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
	public demo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1 = new JLabel("");
		Label1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Label1.setBounds(10, 11, 78, 27);
		contentPane.add(Label1);
		
		textField = new JTextField();
		textField.setBounds(10, 49, 144, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton Button1 = new JButton("SELECT");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = textField.getText();
				Label1.setText(info);
			}
		});
		Button1.setBounds(10, 103, 87, 23);
		contentPane.add(Button1);
	}
}
