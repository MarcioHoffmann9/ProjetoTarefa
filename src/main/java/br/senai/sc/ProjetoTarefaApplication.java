package br.senai.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Tarefa;
import br.senai.sc.repositories.TarefaRepository;

@SpringBootApplication
public class ProjetoTarefaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoTarefaApplication.class, args);
	}
	
	@Autowired
	private TarefaRepository tarefarepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		Tarefa taf1 = new Tarefa(null, "Lavar louça");
		Tarefa taf2 = new Tarefa(null, "Guarda Roupa");
		Tarefa taf3 = new Tarefa(null, "Arrumar a cama");
		Tarefa taf4 = new Tarefa(null, "Fazer compras");
		Tarefa taf5 = new Tarefa(null, "Guardar compras");
		
		tarefarepository.save(taf1);
		tarefarepository.save(taf2);
		tarefarepository.save(taf3);
		tarefarepository.save(taf4);
		tarefarepository.save(taf5);
	}
}
