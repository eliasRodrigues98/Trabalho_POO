package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CentralUI {

	private JFrame frmCentralDeDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CentralUI window = new CentralUI();
					window.frmCentralDeDados.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CentralUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCentralDeDados = new JFrame();
		frmCentralDeDados.setTitle("Central de Dados");
		frmCentralDeDados.setBounds(100, 100, 450, 287);
		frmCentralDeDados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCentralDeDados.getContentPane().setLayout(null);
		
		/**
		 * Initialize the JLabel("Cadastros").
		 */
		JLabel lblCadastros = new JLabel("Cadastros");
		lblCadastros.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastros.setBounds(10, 11, 137, 14);
		frmCentralDeDados.getContentPane().add(lblCadastros);
		/**
		 * Initialize the JLabel("Dados").
		 */
		JLabel lblDados = new JLabel("Dados");
		lblDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblDados.setBounds(250, 11, 155, 14);
		frmCentralDeDados.getContentPane().add(lblDados);
		
		/**
		 * Action for the JButton("Presidente").
		 * Open the PresidenteUI.java.
		 */
		JButton btnPresidente = new JButton("Presidente");
		btnPresidente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PresidenteUI.main(null);
			}
		});
		btnPresidente.setBounds(10, 36, 137, 23);
		frmCentralDeDados.getContentPane().add(btnPresidente);
		
		/**
		 * Action for the JButton("Deputado F.").
		 * Open the DeputadoFUI.java.
		 */
		JButton btnGovernadorF = new JButton("Deputado F.");
		btnGovernadorF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeputadoFUI.main(null);
			}
		});
		btnGovernadorF.setBounds(10, 70, 137, 23);
		frmCentralDeDados.getContentPane().add(btnGovernadorF);
		
		/**
		 * Action for the JButton("Partido").
		 * Open the PartidoUI.java.
		 */
		JButton btnPartido = new JButton("Partido");
		btnPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PartidoUI.main(null);
			}
		});
		btnPartido.setBounds(10, 104, 137, 23);
		frmCentralDeDados.getContentPane().add(btnPartido);
		
		/**
		 * Action for the JButton("Eleitor").
		 * Open the CandidatoUI.java.
		 */
		JButton btnCandidato = new JButton("Eleitor");
		btnCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EleitorUI.main(null);
			}
		});
		btnCandidato.setBounds(10, 138, 137, 23);
		frmCentralDeDados.getContentPane().add(btnCandidato);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviar.setBounds(250, 36, 155, 23);
		frmCentralDeDados.getContentPane().add(btnEnviar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(250, 70, 155, 23);
		frmCentralDeDados.getContentPane().add(btnBuscar);
		
		JLabel lblInformaes = new JLabel("Informa\u00E7\u00F5es");
		lblInformaes.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformaes.setBounds(250, 108, 155, 14);
		frmCentralDeDados.getContentPane().add(lblInformaes);
		
		JButton btnRelCandidato = new JButton("Rela\u00E7\u00E3o Candidato");
		btnRelCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelCandidato.setBounds(250, 138, 155, 23);
		frmCentralDeDados.getContentPane().add(btnRelCandidato);
		
		JButton btnRelEleitor = new JButton("Rela\u00E7\u00E3o Eleitor");
		btnRelEleitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelEleitor.setBounds(250, 172, 155, 23);
		frmCentralDeDados.getContentPane().add(btnRelEleitor);
		
		JButton btnMostrarResultado = new JButton("Mostrar Resultado");
		btnMostrarResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrarResultado.setForeground(new Color(0, 128, 0));
		btnMostrarResultado.setBounds(250, 206, 155, 23);
		frmCentralDeDados.getContentPane().add(btnMostrarResultado);
	}
}
