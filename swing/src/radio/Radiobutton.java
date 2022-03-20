package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Radiobutton extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private final ButtonGroup buttonGroupgender = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radiobutton frame = new Radiobutton();
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
	public Radiobutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton radiomale = new JRadioButton("Male");
		buttonGroupgender.add(radiomale);
		radiomale.setBounds(38, 41, 105, 23);
		contentPane.add(radiomale);
		
		JRadioButton radiofemale = new JRadioButton("Female");
		buttonGroupgender.add(radiofemale);
		radiofemale.setBounds(38, 90, 105, 23);
		contentPane.add(radiofemale);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ép về abstract để xổ các hàm dễ thao tác
				Enumeration<AbstractButton> gender = buttonGroupgender.getElements();//lấy tất cả các control trong group gender
				while(gender.hasMoreElements())//xem ở trong buttongroup còn phần tử không
				{
					//gender.nextelement lấy phần tử hiện tại
					JRadioButton jRadioButton = (JRadioButton) gender.nextElement();
					if(jRadioButton.isSelected()) {
						label1.setText(jRadioButton.getText());
					}
				}
				
			}
		});
		btnNewButton.setBounds(56, 148, 87, 23);
		contentPane.add(btnNewButton);
		
		label1 = new JLabel("");
		label1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		label1.setBounds(38, 195, 69, 23);
		contentPane.add(label1);
	}
}
