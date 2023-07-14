package rh;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor() {
		
	}
	
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setValorVendas(valorVendas);
		this.setComissao(comissao);
	}
	
	public double getValorVendas() {
		return this.valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao() {
		return this.comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		double valorComissao = this.getComissao() * this.getValorVendas() / 100;
		double salarioFinal = super.calcularSalario() + valorComissao;
		return salarioFinal;
	}
	
	
	public String toString() {
		return super.toString() + 
				"\nValor total de vendas: R$" + this.getValorVendas() +
				"\nComissão: " + this.getComissao() + "%" +
				"\nSalário: R$" + this.calcularSalario();
	}
	
	
	
	
	
	
	
	
	

}
