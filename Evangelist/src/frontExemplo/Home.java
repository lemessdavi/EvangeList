package frontExemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Usuario.Usuario;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	public static DefaultListModel listAnimesModel;
	public static DefaultListModel listPersonagensModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					
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
	public Home() {
		Usuario usuario = new Usuario();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listAnimesModel = new DefaultListModel<>();
		
		JList listAnimes = new JList(listAnimesModel);
		listAnimes.setBounds(48, 186, 374, 428);
		contentPane.add(listAnimes);
		
		
		listPersonagensModel = new DefaultListModel<>();
		
		JList listPersonagens = new JList(listPersonagensModel);
		listPersonagens.setBounds(469, 183, 374, 428);
		contentPane.add(listPersonagens);
		
		JButton btnAddPersonagem = new JButton("Adicionar Personagem");
		btnAddPersonagem.setBounds(469, 623, 176, 29);
		contentPane.add(btnAddPersonagem);
		
		JButton btnAddAnime = new JButton("Adicionar Anime");
		btnAddAnime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAnime telaCadastroAnime = new CadastroAnime(usuario);
				telaCadastroAnime.show();
			}
		});
		btnAddAnime.setBounds(48, 626, 176, 29);
		contentPane.add(btnAddAnime);
		
		JLabel lblNewLabel = new JLabel("Evangelist");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel.setBounds(360, 25, 166, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seus Animes Favoritos:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(48, 158, 201, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seus Personagens Favoritos:");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(469, 158, 241, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnEditarAnime = new JButton("Editar Anime");
		btnEditarAnime.setBounds(246, 626, 176, 29);
		contentPane.add(btnEditarAnime);
		
		JButton btnEditarPersonagem = new JButton("Editar Personagem");
		btnEditarPersonagem.setBounds(667, 623, 176, 29);
		contentPane.add(btnEditarPersonagem);
	}
}
