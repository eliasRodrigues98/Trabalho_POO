package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PartidoUI {

	private JFrame frmPartido;
	private JTextField textNome;
	private JTextField textSigla;
	private JTextField textNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PartidoUI window = new PartidoUI();
					window.frmPartido.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PartidoUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPartido = new JFrame();
		frmPartido.setTitle("Partido");
		frmPartido.setBounds(100, 100, 450, 220);
		frmPartido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPartido.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		frmPartido.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(66, 8, 220, 20);
		frmPartido.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblSigla = new JLabel("Sigla:");
		lblSigla.setBounds(10, 51, 46, 14);
		frmPartido.getContentPane().add(lblSigla);
		
		textSigla = new JTextField();
		textSigla.setBounds(66, 48, 86, 20);
		frmPartido.getContentPane().add(textSigla);
		textSigla.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setBounds(10, 91, 46, 14);
		frmPartido.getContentPane().add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setBounds(66, 88, 50, 20);
		frmPartido.getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(new Color(0, 128, 0));
		btnCadastrar.setBounds(332, 138, 92, 23);
		frmPartido.getContentPane().add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPartido.dispose();
			}
		});
		btnCancelar.setForeground(Color.RED);
		btnCancelar.setBounds(235, 138, 89, 23);
		frmPartido.getContentPane().add(btnCancelar);
	}

}
