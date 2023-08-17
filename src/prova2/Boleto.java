package prova2;

public class Boleto {
	private double taxatotal;
	private double valortotal;
	
	public Boleto(double taxatotal, double valortotal) {
		super();
		this.taxatotal = taxatotal;
		this.valortotal = valortotal;
	}

	public double getTaxatotal() {
		return taxatotal;
	}

	public void setTaxatotal(double taxatotal) {
		this.taxatotal = taxatotal;
	}

	public double getValortotal() {
		return valortotal;
	}

	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	
	

}
