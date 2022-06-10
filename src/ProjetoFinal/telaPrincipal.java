package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
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
	public telaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonCadastrar = new JButton("CADASTRAR ITENS PERDIDOS");
		buttonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadastrar firstScreen = new telaCadastrar();
				firstScreen.setVisible(true);
			}
		});
		buttonCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonCadastrar.setBounds(123, 55, 203, 32);
		contentPane.add(buttonCadastrar);
		
		JButton buttonAlterar = new JButton("ALTERAR/EXCLUIR");
		buttonAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaAlterarExcluir thirdScreen = new telaAlterarExcluir();
				thirdScreen.setVisible(true);
			}
		});
		buttonAlterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAlterar.setBounds(123, 184, 203, 32);
		contentPane.add(buttonAlterar);
		
		JButton buttonListar = new JButton("LISTAR ITENS PERDIDOS");
		buttonListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonListar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonListar.setBounds(123, 141, 203, 32);
		contentPane.add(buttonListar);
		
		JButton buttonProcurar = new JButton("PROCURAR ITEM");
		buttonProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaProcurar secondScreen = new telaProcurar();
				secondScreen.setVisible(true);
			}
		});
		buttonProcurar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonProcurar.setBounds(123, 98, 203, 32);
		contentPane.add(buttonProcurar);
	}
}
