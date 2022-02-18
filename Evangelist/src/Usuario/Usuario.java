package Usuario;

import java.util.ArrayList;

import Animes.Anime;

public class Usuario {
	public static ArrayList<Anime> listAnimes;
	
	public Usuario() {
		listAnimes = new ArrayList<Anime>();
	}


	public ArrayList<Anime> getAnimes() {
		return listAnimes;
	}

	
	
	
}
