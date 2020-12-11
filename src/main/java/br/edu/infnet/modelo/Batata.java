package br.edu.infnet.modelo;

import br.edu.infnet.auxiliar.TipoBatata;

public class Batata extends  Lanche {

    private TipoBatata tipoBatata;

    public Batata() {
    }

    public Batata(Integer id, TipoBatata tipoBatata, Integer quantidade) {
        super(id, tipoBatata, quantidade);
        this.tipoBatata = tipoBatata;
    }

    public TipoBatata getTipoBatata() {
        return tipoBatata;
    }

    public void setTipoBatata(TipoBatata tipoBatata) {
        this.tipoBatata = tipoBatata;
    }

    @Override
    public String toString() {
        return "Batata{" +
                "tipoBatata=" + tipoBatata +
                '}';
    }
}
