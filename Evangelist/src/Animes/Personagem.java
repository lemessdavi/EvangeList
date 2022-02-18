package Animes;

public class Personagem {
	private String nome;
	private double avaliacao;
	private Anime animeOrigem;
	

	public Personagem(String nome, double avaliacao, Anime animeOrigem) {
		this.nome = nome;
		this.avaliacao = avaliacao;
		this.animeOrigem = animeOrigem;
	}
	public void editPersonagem(String nome, double avaliacao, Anime animeOrigem) {
		this.nome = nome;
		this.avaliacao = avaliacao;
		this.animeOrigem = animeOrigem;
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	public String getNome() {
		return nome;
	}
	
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome +  "       Avaliação: " + avaliacao+"        Anime de Origem: " +animeOrigem;
	}
}
