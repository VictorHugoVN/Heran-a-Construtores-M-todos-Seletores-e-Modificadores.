package rh;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private double salarioBase;
	private int imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto) {
		super(nome, endereco, telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		
	}
	
	public int getCodigoSetor() {
		return this.codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		if(salarioBase > 0) {
			this.salarioBase = salarioBase;
		}
	}
	
	public int getImposto() {
		return this.imposto;
	}
	
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		double valorPorcentagem = this.getImposto() * this.getSalarioBase() / 100;
		double salarioLiquido = this.getSalarioBase() - valorPorcentagem;
		return salarioLiquido;
	}
	
	public String toString() {
		return super.toString() +
				"\nCódigo do setor: " + this.getCodigoSetor() + 
				"\nSalário Base: R$" + this.getSalarioBase() + 
				"\nImposto: " + this.getImposto() + "%";
	}
	
	
	
	
	
	
	
	
	
	
	

}
