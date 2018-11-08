package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EleitorUI {

	private JFrame frmEleitor;
	private JTextField textNome;
	private JTextField textNumUrna;
	private JTextField textTitulo;
	private JTextField textCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EleitorUI window = new EleitorUI();
					window.frmEleitor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EleitorUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEleitor = new JFrame();
		frmEleitor.setTitle("Eleitor");
		frmEleitor.setBounds(100, 100, 450, 283);
		frmEleitor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEleitor.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(10, 14, 46, 14);
		frmEleitor.getContentPane().add(label);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(66, 11, 200, 20);
		frmEleitor.getContentPane().add(textNome);
		
		JLabel lblNUrna = new JLabel("N\u00BA Urna:");
		lblNUrna.setBounds(10, 131, 46, 14);
		frmEleitor.getContentPane().add(lblNUrna);
		
		textNumUrna = new JTextField();
		textNumUrna.setColumns(10);
		textNumUrna.setBounds(66, 128, 50, 20);
		frmEleitor.getContentPane().add(textNumUrna);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(10, 92, 46, 14);
		frmEleitor.getContentPane().add(lblTtulo);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		textTitulo.setBounds(66, 89, 100, 20);
		frmEleitor.getContentPane().add(textTitulo);
		
		JLabel label_3 = new JLabel("CPF:");
		label_3.setBounds(10, 53, 46, 14);
		frmEleitor.getContentPane().add(label_3);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(66, 50, 100, 20);
		frmEleitor.getContentPane().add(textCPF);
		
		JButton button = new JButton("Cadastrar");
		button.setForeground(new Color(0, 128, 0));
		button.setBounds(335, 211, 92, 23);
		frmEleitor.getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEleitor.dispose();
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setBounds(238, 211, 89, 23);
		frmEleitor.getContentPane().add(button_1);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setBounds(10, 167, 46, 14);
		frmEleitor.getContentPane().add(lblFoto);
		
		JButton btnCarregar = new JButton("Carregar");
		btnCarregar.setBounds(66, 163, 89, 23);
		frmEleitor.getContentPane().add(btnCarregar);
		
		JPanel panelFoto = new JPanel();
		panelFoto.setBounds(276, 14, 148, 167);
		frmEleitor.getContentPane().add(panelFoto);
	}
}
