package servicos;

public class ServicoTaxaMarAzul implements Servicotaxa {
	@Override
	public double calculataxa(double valordiaria) {
		return valordiaria * 0.02 + 15;
	}

}
