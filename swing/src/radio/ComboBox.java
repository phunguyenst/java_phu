package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComboBox extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox frame = new ComboBox();
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
	public ComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Category 1", "Category 2", "Category 3"}));
		comboBox1.setBounds(100, 50, 134, 22);
		contentPane.add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox();
		JLabel LabelCa = new JLabel("");
		LabelCa.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		LabelCa.setBounds(100, 199, 114, 14);
		contentPane.add(LabelCa);
		JLabel Labelindex = new JLabel("");
		Labelindex.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Labelindex.setBounds(100, 224, 114, 14);
		contentPane.add(Labelindex);
		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = comboBox2.getSelectedItem().toString();
				String index = String.valueOf(comboBox2.getSelectedIndex());
				LabelCa.setText(info);
				Labelindex.setText(index);
			}
		});
		comboBox2.setBounds(100, 113, 134, 22);
		
		contentPane.add(comboBox2);
		DefaultComboBoxModel<String> combo = new DefaultComboBoxModel<String>();
		combo.addElement("Category 1");
		combo.addElement("Category 2");
		combo.addElement("Category 3");
		comboBox2.setModel(combo);
		
		JButton buttoncate = new JButton("select");
		buttoncate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = comboBox2.getSelectedItem().toString();
				String index = String.valueOf(comboBox2.getSelectedIndex());
				LabelCa.setText(info);
				Labelindex.setText(index);
			}
		});
		buttoncate.setBounds(100, 158, 87, 23);
		contentPane.add(buttoncate);
		
		
		
	
		
	}
}
