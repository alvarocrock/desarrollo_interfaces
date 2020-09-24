package eval_ini_inter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class interfaz {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz window = new interfaz();
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
	public interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrUsuario = new JTextArea();
		txtrUsuario.setText("usuario: ");
		txtrUsuario.setBounds(23, 59, 79, 22);
		frame.getContentPane().add(txtrUsuario);
		
		textField = new JTextField();
		textField.setBounds(131, 62, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrContrasea = new JTextArea();
		txtrContrasea.setText("Contrase\u00F1a: ");
		txtrContrasea.setBounds(23, 108, 96, 22);
		frame.getContentPane().add(txtrContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 111, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(142, 165, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(268, 59, 158, 22);
		frame.getContentPane().add(textArea);
		
		JTextArea txtrComprobacin = new JTextArea();
		txtrComprobacin.setText("comprobaci\u00F3n");
		txtrComprobacin.setBounds(268, 31, 106, 22);
		frame.getContentPane().add(txtrComprobacin);
	}
}
