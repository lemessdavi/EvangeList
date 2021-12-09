package Usuario;

import java.util.ArrayList;

import Animes.Anime;

public class Usuario {
	private String nome;
	private ArrayList<Anime> animes;
	private String senha;
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		animes = new ArrayList<Anime>();
	}

	public String getNome() {
		return nome;
	}

	public void alterarNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Anime> getAnimes() {
		return animes;
	}

	
	
	
}
