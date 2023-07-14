package rh;

public class Administrador extends Empregado{
	
	private double ajudaCusto;
	
	public Administrador() {
		
	}
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double ajudaCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setAjudaCusto(ajudaCusto);
	}
	
	public double getAjudaCusto() {
		return this.ajudaCusto;
	}
	
	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	
	public double calcularSalario() {
		double salarioFinal = super.calcularSalario() + this.ajudaCusto;
		return salarioFinal;
	}
	
	
	public String toString() {
		return super.toString() +
				"\nAjuda de Custo: R$" + this.getAjudaCusto() +
				"\nSalário: R$" + this.calcularSalario();
	}
	
	
	
	
	
	

}
