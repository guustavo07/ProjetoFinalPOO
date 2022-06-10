package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;

public class telaProcurar extends JFrame {

	private JPanel contentPane;
	private JTextField titulo;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaProcurar frame = new telaProcurar();
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
	public telaProcurar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00CDTULO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		titulo = new JTextField();
		titulo.setBounds(26, 44, 143, 20);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		JRadioButton buttonPerdido = new JRadioButton("Perdido");
		buttonPerdido.setBounds(175, 43, 75, 23);
		contentPane.add(buttonPerdido);
		
		JRadioButton buttonTodos = new JRadioButton("Todos");
		buttonTodos.setBounds(252, 43, 61, 23);
		contentPane.add(buttonTodos);
		
		JButton buttonBuscar = new JButton("BUSCAR");
		buttonBuscar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonBuscar.setBounds(335, 43, 89, 23);
		contentPane.add(buttonBuscar);
		
		table = new JTable();
		table.setBounds(26, 77, 398, 156);
		contentPane.add(table);
	}
}
