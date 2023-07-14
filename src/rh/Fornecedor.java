package rh;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor() {
		
	}

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
	}
	
	public double getValorCredito() {
		return this.valorCredito; 
	}
	
	public void setValorCredito(double valorCredito) {
		if(valorCredito >= 0) {
			this.valorCredito = valorCredito;
		}
	}
	
	public double getValorDivida() {
		return this.valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return this.getValorCredito() - this.getValorDivida();
	}
	
	
	public String toString() {
		return super.toString() + 
				"\nValor Crédito: R$" + this.getValorCredito() + 
				"\nValor Dívida: R$" + this.getValorDivida() +
				"\nSaldo: R$" + this.obterSaldo();
	}
	
	
	
	
	
	




}
