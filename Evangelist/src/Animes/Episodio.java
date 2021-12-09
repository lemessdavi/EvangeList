package Animes;

public class Episodio {
	private String titulo;
	private int duracao; //em minutos, arredondando
	private double avaliacao;
	
	public Episodio(String titulo) {
		this.titulo = titulo;
	}
	
	public Episodio(String titulo, int duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
	}
	public Episodio(String titulo, double avaliacao) {
		this.titulo = titulo;
		this.avaliacao = avaliacao;
	}
	
	public Episodio(String titulo, int duracao, double avaliacao) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.avaliacao = avaliacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getDuracao() {
		return duracao;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
