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
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class PanelBG extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroupBG = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelBG frame = new PanelBG();
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
	public PanelBG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panleBG = new JPanel();
		panleBG.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panleBG.setBounds(0, 0, 434, 173);
		contentPane.add(panleBG);

		JRadioButton radio3 = new JRadioButton("Blue");
		buttonGroupBG.add(radio3);
		radio3.setBounds(189, 185, 105, 23);
		contentPane.add(radio3);

		JRadioButton radio1 = new JRadioButton("White");
		buttonGroupBG.add(radio1);
		radio1.setBounds(10, 185, 85, 23);
		contentPane.add(radio1);

		JRadioButton radio2 = new JRadioButton("Red");
		buttonGroupBG.add(radio2);
		radio2.setBounds(97, 185, 87, 23);
		contentPane.add(radio2);

		JRadioButton radio4 = new JRadioButton("Green");
		buttonGroupBG.add(radio4);
		radio4.setBounds(329, 185, 105, 23);
		contentPane.add(radio4);

		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panleBG.setBackground(laymau(layTenMau()));
			}
		});
		btnNewButton.setBounds(10, 213, 87, 23);
		contentPane.add(btnNewButton);
	}

	private String layTenMau() {
		// lay tat ca cac phan tu nam trong buttongroupBG
		Enumeration<AbstractButton> mau = buttonGroupBG.getElements();
		while (mau.hasMoreElements()) {

			JRadioButton jRadioButton = (JRadioButton) mau.nextElement();
			if (jRadioButton.isSelected()) {
				return jRadioButton.getText();
			}
		}
		return "white";
	}

	private Color laymau(String name) {
		if (name.equalsIgnoreCase("white")) {
			return Color.white;
		} else if (name.equalsIgnoreCase("red")) {
			return Color.red;
		} else if (name.equalsIgnoreCase("green")) {
			return Color.green;
		}

		return Color.blue;
	}
}
