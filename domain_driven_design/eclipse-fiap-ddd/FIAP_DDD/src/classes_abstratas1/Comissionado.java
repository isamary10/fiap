package classes_abstratas1;

public class Comissionado extends Empregado{
	private double totalVendas;
	private double taxaComissao;
	
	public Comissionado(String nome, String sobrenome, String cpf, double totalVendas, double taxaComissao) {
		super(nome, sobrenome, cpf);
		this.setTotalVendas(totalVendas);
		this.setTaxaComissao(taxaComissao);
	}
	
	@Override
	public double vencimento() {
		return this.getTotalVendas() * this.getTaxaComissao();
	}
	
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	
}
