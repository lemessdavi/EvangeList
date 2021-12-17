package frontExemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroAnime extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAnime frame = new CadastroAnime();
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
	public CadastroAnime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(16, 36, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(16, 20, 61, 16);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(314, 36, 33, 26);
		panel.add(textField_1);
		
		JLabel lblAvaliacao = new JLabel("Avaliacao:");
		lblAvaliacao.setBounds(304, 20, 79, 16);
		panel.add(lblAvaliacao);
		
		JButton btnNewButton = new JButton("Adicionar Anime");
		btnNewButton.setBounds(83, 227, 148, 29);
		panel.add(btnNewButton);
		
		JLabel lblSituao = new JLabel("Situação");
		lblSituao.setBounds(16, 86, 79, 16);
		panel.add(lblSituao);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Quero Assistir");
		rdbtnNewRadioButton.setBounds(16, 114, 130, 16);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAssistindo = new JRadioButton("Assistindo");
		rdbtnAssistindo.setBounds(16, 142, 130, 16);
		panel.add(rdbtnAssistindo);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Finalizado");
		rdbtnNewRadioButton_1_1.setBounds(16, 170, 130, 16);
		panel.add(rdbtnNewRadioButton_1_1);
		
		JLabel lblAvaliacao_1 = new JLabel("/ 5");
		lblAvaliacao_1.setBounds(359, 41, 79, 16);
		panel.add(lblAvaliacao_1);
		
		JButton btnNewButton_1 = new JButton("Adicionar Personagem");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPersonagem cadasPers = new CadastroPersonagem();
				cadasPers.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(255, 114, 170, 29);
		panel.add(btnNewButton_1);
		
		JLabel lblCadastrarUmPersonagem = new JLabel("Cadastrar um Personagem?");
		lblCadastrarUmPersonagem.setBounds(255, 90, 179, 29);
		panel.add(lblCadastrarUmPersonagem);
		
		JLabel lblAdicionarUmEpisodio = new JLabel("Adicionar um Episodio?");
		lblAdicionarUmEpisodio.setBounds(265, 157, 154, 29);
		panel.add(lblAdicionarUmEpisodio);
		
		JButton btnNewButton_1_1 = new JButton("Adicionar Episodio");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(255, 179, 170, 29);
		panel.add(btnNewButton_1_1);
	}
}
