package br.edu.infnet.modelo;

import br.edu.infnet.auxiliar.TipoHotDog;

public class HotDog extends Lanche {

    private TipoHotDog tipoHotDog;

    public HotDog() {
    }

    public HotDog(Integer id, TipoHotDog tipoHotDog, Integer quantidade) {
        super(id, tipoHotDog, quantidade);
        this.tipoHotDog = tipoHotDog;
    }

    public TipoHotDog getTipoHotDog() {
        return tipoHotDog;
    }

    public void setTipoHotDog(TipoHotDog tipoHotDog) {
        this.tipoHotDog = tipoHotDog;
    }

    @Override
    public String toString() {
        return "HotDog{" +
                "tipoHotDog=" + tipoHotDog +
                '}';
    }
}
