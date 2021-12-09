package Animes;

public class Personagem {
	private String nome;
	private double avaliacao;
	
	public Personagem(String nome) {
		this.nome = nome;
	}
	public Personagem(String nome, double avaliacao) {
		this.nome = nome;
		this.avaliacao = avaliacao;
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
}
