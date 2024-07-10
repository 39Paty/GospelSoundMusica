package br.com.alura.GospelSoundMusicas;

import br.com.alura.GospelSoundMusicas.principal.Principal;
import br.com.alura.GospelSoundMusicas.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GospelSoundMusicasApplication implements CommandLineRunner {

	@Autowired
	private ArtistaRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(GospelSoundMusicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
