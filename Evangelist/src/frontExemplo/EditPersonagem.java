package frontExemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Animes.Anime;
import Animes.Personagem;

public class EditPersonagem extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldAvaliacao;
	private Anime anime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditPersonagem(Personagem personagem) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(17, 52, 130, 26);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		textFieldNome.setText(personagem.getNome());
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(19, 34, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblAvaliacao = new JLabel("Avaliacao:");
		lblAvaliacao.setBounds(289, 34, 79, 16);
		contentPane.add(lblAvaliacao);
		
		textFieldAvaliacao = new JTextField();
		textFieldAvaliacao.setColumns(10);
		textFieldAvaliacao.setBounds(299, 50, 33, 26);
		contentPane.add(textFieldAvaliacao);
		textFieldAvaliacao.setText(String.valueOf(personagem.getAvaliacao()));
		
		JLabel lblAvaliacao_1 = new JLabel("/ 5");
		lblAvaliacao_1.setBounds(344, 55, 79, 16);
		contentPane.add(lblAvaliacao_1);
		
		
		
		
		JComboBox comboBoxAnime = new JComboBox(Home.listAnimesModel.toArray());
		comboBoxAnime.setBounds(17, 141, 154, 27);
		contentPane.add(comboBoxAnime);
		
		JLabel lblAnimeDoPersonagem = new JLabel("Anime do Personagem:");
		lblAnimeDoPersonagem.setBounds(17, 123, 179, 16);
		contentPane.add(lblAnimeDoPersonagem);
		
		JButton btnAddPersonagem = new JButton("Adicionar Personagem");
		btnAddPersonagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anime animeSelecionado = (Anime) comboBoxAnime.getSelectedItem();
				personagem.editPersonagem(textFieldNome.getText(),Double.parseDouble(textFieldAvaliacao.getText()),animeSelecionado);
				dispose();
				
			}
		});
		btnAddPersonagem.setBounds(249, 183, 174, 29);
		contentPane.add(btnAddPersonagem);
	}

}
