package Animes;

import java.util.ArrayList;

public class Anime {
	private String nome;
	public static ArrayList<Personagem> personagens;
	private double avaliacao;
	private String situacao; // 0- quero assistir | 1- assitindo | 2- finalizado
	//private String situacaoOpceos[] = {"Quero Assistir", "Assitindo", "Finalizado"};
	
	public Anime(String nome, String situacao, double avaliacao ) {
		this.nome = nome;
		this.situacao = situacao;
		this.avaliacao = avaliacao;
		personagens = new ArrayList();
	}
	
	public void editAnime(String nome, String situacao, double avaliacao ) {
		this.nome = nome;
		this.situacao = situacao;
		this.avaliacao = avaliacao;

	}
	
	
	public void addPersonagem(Personagem personagem){
		personagens.add(personagem);
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public ArrayList<Personagem> getPersonagens() {
		return personagens;
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	
	
	public String getSituacao() {
		return situacao;
	}
	
	public void mudaAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void mudaSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public void mudaNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return nome + "           Avaliação: " + avaliacao;
	}
}
