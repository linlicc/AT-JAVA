package br.edu.infnet.modelo;

import br.edu.infnet.auxiliar.TipoBatata;
import br.edu.infnet.auxiliar.TipoHamburguer;
import br.edu.infnet.auxiliar.TipoHotDog;

import java.util.Objects;

public abstract class Lanche {

    private Integer id;
    private Float preco;
    private Integer quantidade;
    
    private String tipoDeLanche;
    
    public Lanche() {

    }

    public Lanche(Integer id, Float preco) {
        this.id = id;
        this.preco = preco;
    }

    // construtor para batata
    public Lanche(Integer id, TipoBatata tipo, Integer quantidade) {
        this.id = id;
        this.quantidade = quantidade;
        
        this.tipoDeLanche = tipo.name();

        if (tipo == TipoBatata.BATATA_SIMPLES) {
            this.preco = Float.valueOf(5 * quantidade);
        } else {
            this.preco = Float.valueOf(10 * quantidade);
        }
    }

    // construtor para hotDog
    public Lanche(Integer id, TipoHotDog tipo, Integer quantidade) {
        this.id = id;
        this.tipoDeLanche = tipo.name();
        this.quantidade = quantidade;

        if (tipo == TipoHotDog.LINGUICA) {
            this.preco = Float.valueOf(5 * quantidade);
        } else {
            this.preco = Float.valueOf(10 * quantidade);
        }
    }

    // construtor para hamburuger
    public Lanche(Integer id, TipoHamburguer tipo, Integer quantidade) {
        this.id = id;
        this.tipoDeLanche = tipo.name();
        this.quantidade = quantidade;

        if (tipo == TipoHamburguer.XBURGUER) {
            this.preco = Float.valueOf(5 * quantidade);
        } else {
            this.preco = Float.valueOf(10 * quantidade);
        }
    }
    
    public String getTipoDeLanche() {
    	return tipoDeLanche;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setTipoDeLanche(String tipoDeLanche) {
		this.tipoDeLanche = tipoDeLanche;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lanche lanche = (Lanche) o;
        return Objects.equals(id, lanche.id) && Objects.equals(preco, lanche.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preco);
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "id=" + id +
                ", preco=" + preco +
                '}';
    }
}
