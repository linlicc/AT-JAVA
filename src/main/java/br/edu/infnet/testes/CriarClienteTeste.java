package br.edu.infnet.testes;

import br.edu.infnet.modelo.Cliente;

public class CriarClienteTeste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Aline", "12345678", "Rua Alegre");
		
		System.out.println(cliente.toString());
	}
}
