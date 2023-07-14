package rh;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if(nome != null) {
			this.nome = nome;
		}
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		if(endereco != null) {
			this.endereco = endereco;
		}
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		if(telefone != null) {
			this.telefone = telefone;
		}
	}
	
	
	
	
	public String toString() {
		return "Nome: " + this.getNome() +
				"\nEndereço: " + this.getEndereco() +
				"\nTelefone: " + this.getTelefone();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
