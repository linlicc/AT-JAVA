package br.edu.infnet.testes;

import br.edu.infnet.auxiliar.TipoBatata;
import br.edu.infnet.modelo.Batata;
import br.edu.infnet.modelo.Lanche;

public class BatataTeste {
	
	public static void main(String[] args) {
		Lanche lanceBatataSimples = new Batata(1, TipoBatata.BATATA_SIMPLES, 5);
		
		System.out.println("Teste 1:" +lanceBatataSimples.getTipoDeLanche());
		
		Lanche lanceBatataMaluca = new Batata(2, TipoBatata.BATATA_MALUCA, 10);
		System.out.println("Teste 2:" + lanceBatataMaluca.getTipoDeLanche());
		
	}

}
