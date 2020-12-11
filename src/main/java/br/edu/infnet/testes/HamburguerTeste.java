package br.edu.infnet.testes;

import br.edu.infnet.auxiliar.TipoHamburguer;
import br.edu.infnet.modelo.Hamburguer;
import br.edu.infnet.modelo.Lanche;

public class HamburguerTeste {
	public static void main(String[] args) {
		
		
		Lanche lancheHamburguer = new Hamburguer(1, TipoHamburguer.XBACON, 1);
		System.out.println(lancheHamburguer.getTipoDeLanche());
		
		Lanche lancheHamburguerXburguer = new Hamburguer(1, TipoHamburguer.XBURGUER, 1);
		System.out.println(lancheHamburguerXburguer.getTipoDeLanche());
		
	}
}
