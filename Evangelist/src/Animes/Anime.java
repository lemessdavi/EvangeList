package Animes;

import java.util.ArrayList;

public class Anime {
	private String nome;
	private ArrayList<Episodio> episodios;
	private ArrayList<Personagem> personagens;
	private double avaliacao;
	private int situacao; // 0- quero assistir | 1- assitindo | 2- finalizado
	
	public Anime(String nome, int situacao, double avaliacao ) {
		this.nome = nome;
		this.situacao = situacao;
		this.avaliacao = avaliacao;
	}
	
	public void addEpisodio(Episodio episodio){
		episodios.add(episodio);
	}
	
	public void addPersonagem(Personagem personagem){
		personagens.add(personagem);
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}
	
	public ArrayList<Personagem> getPersonagens() {
		return personagens;
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	
	
	public int getSituacao() {
		return situacao;
	}
	
	public void mudaAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void mudaSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	public void mudaNome(String nome) {
		this.nome = nome;
	}
}
