package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;



import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkbox extends JFrame {

	private JPanel contentPane;
	private JLabel lablelanguage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox frame = new checkbox();
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
	public checkbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panellanguage = new JPanel();
		panellanguage.setBorder(new TitledBorder(null, "Language", TitledBorder.LEADING, TitledBorder.TOP, null, Color.CYAN));
		panellanguage.setBounds(0, 0, 182, 173);
		contentPane.add(panellanguage);
		
		JCheckBox checkbox1 = new JCheckBox("Language1");
		panellanguage.add(checkbox1);
		
		JCheckBox checkbox2 = new JCheckBox("Language2");
		panellanguage.add(checkbox2);
		
		JCheckBox checkbox3 = new JCheckBox("Language3");
		panellanguage.add(checkbox3);
		
		JCheckBox checkbox4 = new JCheckBox("Language4");
		panellanguage.add(checkbox4);
		
		JCheckBox checkbox5 = new JCheckBox("Language5");
		panellanguage.add(checkbox5);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = "";
				//lay tat ca cac control trong panel ra, tra ve mang co kieu du lieu la components
				for(Component cpn : panellanguage.getComponents()) {
					//gap cac control trong panel ep ve kieu Jcheckbox
					JCheckBox jCheckBox= (JCheckBox) cpn;
					if(jCheckBox.isSelected())
						s1 += jCheckBox.getText()+ ";";
				}
				lablelanguage.setText(s1);
				 
			}
		});
		btnNewButton.setBounds(36, 184, 87, 23);
		contentPane.add(btnNewButton);
		
		lablelanguage = new JLabel("");
		lablelanguage.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lablelanguage.setBounds(10, 228, 156, 23);
		contentPane.add(lablelanguage);
	}
}
