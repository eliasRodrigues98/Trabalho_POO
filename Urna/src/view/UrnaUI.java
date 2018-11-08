package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;

public class UrnaUI {

	private JFrame frame;
	private JTextField textField;
	private JPanel panel;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JPanel panel_1;
	private JButton btnBranco;
	private JButton btnCorrige;
	private JButton btnConfirma;
	String text = new String();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UrnaUI window = new UrnaUI();
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
	public UrnaUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 266);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVoteParaGovernador = new JLabel("Vote para Governador Federal");
		lblVoteParaGovernador.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoteParaGovernador.setBounds(10, 32, 180, 14);
		frame.getContentPane().add(lblVoteParaGovernador);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField.setEnabled(false);
		textField.setBounds(56, 57, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(200, 0, 254, 180);
		frame.getContentPane().add(panel);
		panel.setLayout(new MigLayout("", "[100px,center][100px][100px]", "[100px][100px][100px][100px]"));
		
		button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"1");
				}
			}
		});
		panel.add(button, "cell 0 0,grow");
		
		button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"2");
				}
			}
		});
		panel.add(button_1, "cell 1 0,grow");
		
		button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"3");
				}
			}
		});
		panel.add(button_2, "cell 2 0,grow");
		
		button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"4");
				}
			}
		});
		panel.add(button_3, "cell 0 1,grow");
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"5");
				}
			}
		});
		panel.add(button_4, "cell 1 1,grow");
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"6");
				}
			}
		});
		panel.add(button_5, "cell 2 1,grow");
		
		button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"7");
				}
			}
		});
		panel.add(button_6, "cell 0 2,grow");
		
		button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"8");
				}
			}
		});
		panel.add(button_7, "cell 1 2,grow");
		
		button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"9");
				}
			}
		});
		panel.add(button_8, "cell 2 2,grow");
		
		button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 4) {
					text = textField.getText();
					textField.setText(text+"0");
				}
			}
		});
		panel.add(button_9, "cell 1 3,grow");
		
		panel_1 = new JPanel();
		panel_1.setBounds(200, 179, 254, 49);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new MigLayout("", "[100px][100px][100px]", "[100px]"));
		
		btnBranco = new JButton("Branco");
		btnBranco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-------------");
			}
		});
		panel_1.add(btnBranco, "cell 0 0,grow");
		
		btnCorrige = new JButton("Corrige");
		btnCorrige.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		panel_1.add(btnCorrige, "cell 1 0,grow");
		
		btnConfirma = new JButton("Confirma");
		btnConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblVoteParaGovernador.setText("Vote para Presidente");
			}
		});
		panel_1.add(btnConfirma, "cell 2 0,grow");
	}
}
