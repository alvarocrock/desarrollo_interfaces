package eval_ini_inter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class interfaz implements ActionListener{

	private JFrame frame;
	private JTextField jtfusuario;
	private JTextField jtfpasswd;
	private controlador micontrolador;
	private JTextField jtfresul;
	private final Action action = new SwingAction();

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
		
		micontrolador = new controlador();
		micontrolador.cargar_users();
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea etiqueta_usuario = new JTextArea();
		etiqueta_usuario.setText("usuario: ");
		etiqueta_usuario.setBounds(23, 59, 79, 22);
		frame.getContentPane().add(etiqueta_usuario);
		
		jtfusuario = new JTextField();
		jtfusuario.setBounds(131, 62, 96, 19);
		frame.getContentPane().add(jtfusuario);
		jtfusuario.setColumns(10);
		
		JTextArea etiqueta_contraseña = new JTextArea();
		etiqueta_contraseña.setText("Contrase\u00F1a: ");
		etiqueta_contraseña.setBounds(23, 108, 96, 22);
		frame.getContentPane().add(etiqueta_contraseña);
		
		jtfpasswd = new JTextField();
		jtfpasswd.setBounds(131, 111, 96, 19);
		frame.getContentPane().add(jtfpasswd);
		jtfpasswd.setColumns(10);
		
		JButton button = new JButton("Login");
		button.addActionListener(this);
		button.setBounds(142, 165, 85, 21);
		frame.getContentPane().add(button);
		
		JTextArea txtrComprobacin = new JTextArea();
		txtrComprobacin.setText("comprobaci\u00F3n");
		txtrComprobacin.setBounds(268, 31, 106, 22);
		frame.getContentPane().add(txtrComprobacin);
		
		jtfresul = new JTextField();
		jtfresul.setBounds(268, 62, 96, 19);
		frame.getContentPane().add(jtfresul);
		jtfresul.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (micontrolador.compro_passwd(jtfpasswd.getText())==true && micontrolador.compro_user(jtfusuario.getText())==true) {
			//modificamos textro resultados
			jtfresul.setText("correcto");	
		} else {
			//modificamos texto resultado
			jtfresul.setText("Incorrecto");
		}
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
