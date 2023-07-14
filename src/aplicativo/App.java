package aplicativo;

import rh.Pessoa;
import rh.Fornecedor;
import rh.Empregado;
import rh.Administrador;
import rh.Operario;
import rh.Vendedor;

public class App {
	
	public static void main(String[] args) { 
		
		Pessoa p1 = new Pessoa("Victor Hugo", "Anápolis, Goiás", "99999-9999");
		//System.out.println(p1.toString());
		
		Fornecedor f1 = new Fornecedor("Rafaela Oliveira", "Anápolis, Goiás", "77777-7777", 500.0, 200.0);
		//System.out.println(f1.toString());
		
		Empregado emp1 = new Empregado("Otávio Dias", "Goiânia, Goiás", "88888-8888", 43, 2000.0, 20);
		//System.out.println(emp1.toString());
		
		Administrador adm1 = new Administrador("Ana Souza", "Brasília, DF", "98989-0000", 51, 4500.0, 10, 1000.0);
		//System.out.println(adm1.toString());
		
		Operario op1 = new Operario("Mário Nunes", "Anápolis, Goiás", "11111-1111", 10, 3000.0, 5, 1000.0, 10.0);
		//System.out.println(op1.toString());
		
		Vendedor vendedor1 = new Vendedor("Fernanda Gaspar", "Goiânia, Goiás", "12123-4567", 9, 5000.0, 6, 2500.0, 9.0);
		System.out.println(vendedor1.toString());
		
		
	}

}
