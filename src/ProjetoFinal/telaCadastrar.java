package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class telaCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField local;
	private JTextField data;
	private JTextField hora;
	private JTextField titulo;
	private JTextField observacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastrar frame = new telaCadastrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaCadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOCAL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 71, 46, 17);
		contentPane.add(lblNewLabel);
		
		local = new JTextField();
		local.setBounds(77, 70, 189, 20);
		contentPane.add(local);
		local.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DATA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 102, 40, 14);
		contentPane.add(lblNewLabel_1);
		
		data = new JTextField();
		data.setBounds(77, 100, 65, 20);
		contentPane.add(data);
		data.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("HORA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(145, 102, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		hora = new JTextField();
		hora.setBounds(198, 100, 68, 20);
		contentPane.add(hora);
		hora.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00CDTULO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(21, 40, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		titulo = new JTextField();
		titulo.setBounds(77, 39, 189, 20);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("OBSERVA\u00C7\u00C3O");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(21, 129, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		observacao = new JTextField();
		observacao.setBounds(21, 154, 245, 83);
		contentPane.add(observacao);
		observacao.setColumns(10);
		
		JButton buttonSalvar = new JButton("SALVAR");
		buttonSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonSalvar.setBounds(323, 205, 90, 32);
		contentPane.add(buttonSalvar);
		
		JLabel lblNewLabel_5 = new JLabel("STATUS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(312, 76, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton buttonPerdido = new JRadioButton("Perdido");
		buttonPerdido.setBounds(269, 102, 74, 17);
		contentPane.add(buttonPerdido);
		
		JRadioButton buttonEncontrado = new JRadioButton("Encontrado");
		buttonEncontrado.setBounds(339, 99, 95, 23);
		contentPane.add(buttonEncontrado);
	}
}
