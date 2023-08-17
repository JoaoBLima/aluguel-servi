package servicos;
import prova2.Aluguel;
import prova2.Boleto;

import java.time.Duration;
import servicos.Servicotaxa;


public class ServicoGerarBoleto {
	private double valordiaria;
	private Servicotaxa servicotaxa;
	public ServicoGerarBoleto(double valordiaria, Servicotaxa servicotaxa) {
		super();
		this.valordiaria = valordiaria;
		this.servicotaxa = servicotaxa;
	}
	public ServicoGerarBoleto () {
		
	}
	public double getValordiaria() {
		return valordiaria;
	}
	public void setValordiaria(double valordiaria) {
		this.valordiaria = valordiaria;
	}
	public Servicotaxa getServicotaxa() {
		return servicotaxa;
	}
	public void setServicotaxa(Servicotaxa servicotaxa) {
		this.servicotaxa = servicotaxa;
	}
	
	public void processarBoleto(Aluguel aluguel) {
	    
	    Duration duracao = Duration.between(aluguel.getEntrada(), aluguel.getSaida());
	    long numeroDiarias = duracao.toDays();

	   
	    double taxaTotal = servicotaxa.calculataxa(valordiaria) * numeroDiarias;

	   
	    double valorTotal = (valordiaria * numeroDiarias) + taxaTotal;

	  
	    Boleto boleto = new Boleto(taxaTotal, valorTotal);

	  


}
}
