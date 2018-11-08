package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PresidenteUI {

	private JFrame frmPresidente;
	private JTextField textNome;
	private JTextField textPartido;
	private JTextField textNumero;
	private JTextField textCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PresidenteUI window = new PresidenteUI();
					window.frmPresidente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PresidenteUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPresidente = new JFrame();
		frmPresidente.setTitle("Presidente");
		frmPresidente.setBounds(100, 100, 450, 239);
		frmPresidente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPresidente.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		frmPresidente.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(66, 8, 200, 20);
		frmPresidente.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido:");
		lblPartido.setBounds(10, 128, 46, 14);
		frmPresidente.getContentPane().add(lblPartido);
		
		textPartido = new JTextField();
		textPartido.setBounds(66, 125, 50, 20);
		frmPresidente.getContentPane().add(textPartido);
		textPartido.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(10, 89, 46, 14);
		frmPresidente.getContentPane().add(lblNmero);
		
		textNumero = new JTextField();
		textNumero.setBounds(66, 86, 50, 20);
		frmPresidente.getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 50, 46, 14);
		frmPresidente.getContentPane().add(lblCpf);
		
		textCPF = new JTextField();
		textCPF.setBounds(66, 47, 100, 20);
		frmPresidente.getContentPane().add(textCPF);
		textCPF.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadastrar.setForeground(new Color(0, 128, 0));
		btnCadastrar.setBounds(335, 166, 92, 23);
		frmPresidente.getContentPane().add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPresidente.dispose();
			}
		});
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setBounds(235, 166, 89, 23);
		frmPresidente.getContentPane().add(btnCancelar);
	}

	public void setVisible(boolean b) {
		PresidenteUI window = new PresidenteUI();
		window.frmPresidente.setVisible(true);
	}

}
