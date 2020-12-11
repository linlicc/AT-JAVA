package br.edu.infnet.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente {

    private Integer id;

    private String nome;

    private String telefone;

    private String endereco;
    
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
        
    }

    public Cliente(String nome, String telefone, String endereco) {
    	this.id = new Random().nextInt();
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
