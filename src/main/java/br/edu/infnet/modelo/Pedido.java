package br.edu.infnet.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;

    private List<Lanche> lanches = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(Cliente cliente, List<Lanche> lanches) {
        this.cliente = cliente;
        this.lanches = lanches;
    }
    
    public void adicionarPedido(Lanche lanche) {
    	this.lanches.add(lanche);
    }
    
    public void adicionarCliente(Cliente cliente) {
    	this.cliente = cliente;
    }
    
    public float obterTotalDoPedido() {
    	float totalPedido = 0;
    	
    	for(Lanche lanche : lanches) {
    		totalPedido = totalPedido + lanche.getPreco();
    	}
    	return totalPedido;
    }
    
    public void obterInformacoesDoCliente() {
    	System.out.println(this.cliente.toString());
    }
    
    public void obterItensDoPedido() {
    	for(Lanche lanche : lanches) {
    		System.out.println(lanche.getTipoDeLanche() + " - qtd: " + lanche.getQuantidade());
    	}
    }
    
    

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Lanche> getLanches() {
		return lanches;
	}

	public void setLanches(List<Lanche> lanches) {
		this.lanches = lanches;
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", lanches=" + lanches + "]";
	}
}



// pedido

    // cliente

    // lanche
        // hamburguer
        // hotdog
        // batata