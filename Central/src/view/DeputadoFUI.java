package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeputadoFUI {

	private JFrame frmDeputadoFederal;
	private JTextField textNome;
	private JTextField textPartido;
	private JTextField textNumero;
	private JTextField textCPF;
	private JTextField textUF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeputadoFUI window = new DeputadoFUI();
					window.frmDeputadoFederal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeputadoFUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeputadoFederal = new JFrame();
		frmDeputadoFederal.setTitle("Deputado Federal");
		frmDeputadoFederal.setBounds(100, 100, 450, 285);
		frmDeputadoFederal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeputadoFederal.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(10, 14, 46, 14);
		frmDeputadoFederal.getContentPane().add(label);
		
		textNome = new JTextField();
		textNome.setBounds(66, 11, 200, 20);
		textNome.setColumns(10);
		frmDeputadoFederal.getContentPane().add(textNome);
		
		JLabel label_1 = new JLabel("Partido:");
		label_1.setBounds(10, 131, 46, 14);
		frmDeputadoFederal.getContentPane().add(label_1);
		
		textPartido = new JTextField();
		textPartido.setBounds(66, 128, 50, 20);
		textPartido.setColumns(10);
		frmDeputadoFederal.getContentPane().add(textPartido);
		
		JLabel label_2 = new JLabel("N\u00FAmero:");
		label_2.setBounds(10, 92, 46, 14);
		frmDeputadoFederal.getContentPane().add(label_2);
		
		textNumero = new JTextField();
		textNumero.setBounds(66, 89, 50, 20);
		textNumero.setColumns(10);
		frmDeputadoFederal.getContentPane().add(textNumero);
		
		JLabel label_3 = new JLabel("CPF:");
		label_3.setBounds(10, 53, 46, 14);
		frmDeputadoFederal.getContentPane().add(label_3);
		
		textCPF = new JTextField();
		textCPF.setBounds(66, 50, 100, 20);
		textCPF.setColumns(10);
		frmDeputadoFederal.getContentPane().add(textCPF);
		
		JButton button = new JButton("Cadastrar");
		button.setBounds(335, 211, 92, 23);
		button.setForeground(new Color(0, 128, 0));
		frmDeputadoFederal.getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeputadoFederal.dispose();
			}
		});
		button_1.setBounds(236, 211, 89, 23);
		button_1.setForeground(Color.RED);
		frmDeputadoFederal.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("UF:");
		lblNewLabel.setBounds(10, 167, 46, 14);
		frmDeputadoFederal.getContentPane().add(lblNewLabel);
		
		textUF = new JTextField();
		textUF.setBounds(66, 164, 50, 20);
		frmDeputadoFederal.getContentPane().add(textUF);
		textUF.setColumns(10);
	}

}
