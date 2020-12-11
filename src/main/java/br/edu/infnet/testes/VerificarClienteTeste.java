package br.edu.infnet.testes;

import br.edu.infnet.auxiliar.TipoBatata;
import br.edu.infnet.auxiliar.TipoHamburguer;
import br.edu.infnet.auxiliar.TipoHotDog;
import br.edu.infnet.modelo.Batata;
import br.edu.infnet.modelo.Cliente;
import br.edu.infnet.modelo.Hamburguer;
import br.edu.infnet.modelo.HotDog;
import br.edu.infnet.modelo.Lanche;
import br.edu.infnet.modelo.Pedido;

public class VerificarClienteTeste {
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();

		Cliente aline = new Cliente("Aline", "12345678", "Rua Alegre");

		Lanche lanceBatataSimples = new Batata(1, TipoBatata.BATATA_SIMPLES, 5);
		Lanche lancheHamburguer = new Hamburguer(1, TipoHamburguer.XBACON, 1);
		Lanche lancheHotDogLinguica = new HotDog(1, TipoHotDog.LINGUICA, 1);
		
		pedido.adicionarCliente(aline);
		
		pedido.adicionarPedido(lanceBatataSimples);
		pedido.adicionarPedido(lancheHamburguer);
		pedido.adicionarPedido(lancheHotDogLinguica);
		
		
		pedido.obterInformacoesDoCliente();
		
		
		
	}
}
