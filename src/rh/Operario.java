package rh;

public class Operario extends Empregado{
	
	private double valorProducao;
	private double comissao;
	
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setValorProducao(valorProducao);
		this.setComissao(comissao);
	}
	
	
	public double getValorProducao() {
		return this.valorProducao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double getComissao() {
		return this.comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		double valorComissao = this.comissao * this.valorProducao / 100;
		double salarioFinal = super.calcularSalario() + valorComissao;
		return salarioFinal;
	}
	
	
	
	public String toString() {
		return super.toString() +
				"\nValor de Produção: R$" + this.getValorProducao() +
				"\nComissão: " + this.getComissao() + "%" +
				"\nSalário: R$" + this.calcularSalario();
				
	}
	
	
	
	
	
	

}
