package servicos;

public class ServicoTaxaParaiso implements Servicotaxa {
	@Override
	public double calculataxa(double valordiaria) {
		return valordiaria * 0.5 + 10;
	}
}
