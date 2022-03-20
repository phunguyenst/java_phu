package swingbutton;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo extends JFrame {

	// private JFrame frame;
	JButton button;

	/**
	 * constructor
	 */
	public JFrameDemo() {
		createAndShow();
	}

	/**
	 * hàm tạo bảng vào button
	 */
	public void createAndShow() {
		button = new JButton("Linh Wibu");
		/*
		 * frame = new JFrame("Title"); frame.setSize(400,300);
		 */
		setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button);
		this.setLayout(new FlowLayout());
		// this.pack();
		this.setVisible(true);
	}

	/**
	 * hàm main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new JFrameDemo();
	}
}
