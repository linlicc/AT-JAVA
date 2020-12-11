package br.edu.infnet.modelo;

import br.edu.infnet.auxiliar.TipoHamburguer;

public class Hamburguer extends  Lanche {

    private TipoHamburguer tipoHamburguer;

    public Hamburguer(Integer id, TipoHamburguer tipo, Integer quantidade) {
        super(id, tipo, quantidade);
        this.tipoHamburguer = tipo;
    }

    public TipoHamburguer getTipoHamburguer() {
        return tipoHamburguer;
    }

    public void setTipoHamburguer(TipoHamburguer tipoHamburguer) {
        this.tipoHamburguer = tipoHamburguer;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "tipoHamburguer=" + tipoHamburguer +
                '}';
    }
}
