package grothem;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * 
 * @author Joshua
 *
 */
public class MyMain {

	private JFrame frame;
	private JTextField textOutput;
	private JTextField textInput;
	private JButton btnBuild;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyMain window = new MyMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyMain() {
		initialize();
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkPassword();
			}
		});
	}

	private void checkPassword() {
		Password password = new Password(textInput.getText());
		textOutput.setText(password.blockSize());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter Password");
		lblNewLabel.setBounds(10, 63, 119, 14);
		frame.getContentPane().add(lblNewLabel);

		btnBuild = new JButton("Test Security");
		btnBuild.setBounds(160, 122, 128, 23);
		frame.getContentPane().add(btnBuild);

		textOutput = new JTextField();
		textOutput.setBounds(10, 186, 414, 20);
		frame.getContentPane().add(textOutput);
		textOutput.setColumns(10);

		textInput = new JTextField();
		textInput.setBounds(162, 60, 158, 20);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
	}
}
