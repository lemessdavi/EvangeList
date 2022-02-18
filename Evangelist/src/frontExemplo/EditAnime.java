package frontExemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Animes.Anime;
import Usuario.Usuario;

public class EditAnime extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldAvaliacao;
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
	public EditAnime(Anime animeSelecioando) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(16, 36, 130, 26);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		textFieldNome.setText(animeSelecioando.getNome());
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(16, 20, 61, 16);
		panel.add(lblNome);
		
		textFieldAvaliacao = new JTextField();
		textFieldAvaliacao.setColumns(10);
		textFieldAvaliacao.setBounds(314, 36, 33, 26);
		panel.add(textFieldAvaliacao);
		textFieldAvaliacao.setText(String.valueOf(animeSelecioando.getAvaliacao()));
		
		JLabel lblAvaliacao = new JLabel("Avaliacao:");
		lblAvaliacao.setBounds(312, 20, 79, 16);
		panel.add(lblAvaliacao);
		
	
		
		JLabel lblSituacao = new JLabel("Situação");
		lblSituacao.setBounds(16, 99, 79, 16);
		panel.add(lblSituacao);
		
		
		// boxes
		
		JRadioButton checkQueroAssistir = new JRadioButton("Quero Assistir");
		checkQueroAssistir.setBounds(16, 127, 130, 16);
		panel.add(checkQueroAssistir);
		checkQueroAssistir.setActionCommand("Quero Assistir");
		
		
		JRadioButton checkAssistindo = new JRadioButton("Assistindo");
		checkAssistindo.setBounds(16, 155, 130, 16);
		panel.add(checkAssistindo);
		checkAssistindo.setActionCommand("Assistindo");
		
		JRadioButton checkFinalizado = new JRadioButton("Finalizado");
		checkFinalizado.setBounds(16, 183, 130, 16);
		panel.add(checkFinalizado);
		checkFinalizado.setActionCommand("Finalizado");
		
		checkFinalizado.getText();
		
		ButtonGroup group = new ButtonGroup();
		group.add(checkFinalizado);
		group.add(checkQueroAssistir);
		group.add(checkAssistindo);
		
		
		
		 for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.getText() == animeSelecioando.getSituacao()) {
	                button.setSelected(true);
	            }
	        }

		
		
		
		// boxes
		
		JLabel lblAvaliacao_1 = new JLabel("/ 5");
		lblAvaliacao_1.setBounds(359, 41, 79, 16);
		panel.add(lblAvaliacao_1);
		
		JButton btnAddPersonagem = new JButton("Adicionar Personagem");
		btnAddPersonagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String selecionado = group.getSelection().getActionCommand();
				animeSelecioando.editAnime(textFieldNome.getText(), selecionado ,Double.parseDouble(textFieldAvaliacao.getText()) );
				dispose();;
				CadastroPersonagem cadasPers = new CadastroPersonagem();
				cadasPers.setVisible(true);
			}
		});
		btnAddPersonagem.setBounds(255, 123, 170, 29);
		panel.add(btnAddPersonagem);
		
		JLabel lblCadastrarUmPersonagem = new JLabel("Cadastrar um Personagem?");
		lblCadastrarUmPersonagem.setBounds(255, 99, 179, 29);
		panel.add(lblCadastrarUmPersonagem);
		
		JButton btnAddAnime = new JButton("Salvar Alterações");
		btnAddAnime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionado = group.getSelection().getActionCommand();
				animeSelecioando.editAnime(textFieldNome.getText(), selecionado ,Double.parseDouble(textFieldAvaliacao.getText()) );
				dispose();
			}
		});
		btnAddAnime.setBounds(264, 211, 148, 29);
		panel.add(btnAddAnime);
	}

}
