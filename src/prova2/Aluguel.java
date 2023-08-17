package prova2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluguel {
	private LocalDate entrada;
	private LocalDate saida;
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Aluguel(LocalDate entrada, LocalDate saida) {
		super();
		this.entrada = entrada;
		this.saida = saida;
	}


	public LocalDate getEntrada() {
		return entrada;
	}


	public void setEntrada(LocalDate entrada) {
		this.entrada = entrada;
	}


	public LocalDate getSaida() {
		return saida;
	}


	public void setSaida(LocalDate saida) {
		this.saida = saida;
	}
	
	

}
