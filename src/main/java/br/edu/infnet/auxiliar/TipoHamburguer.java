package br.edu.infnet.auxiliar;

public enum TipoHamburguer {

    XBURGUER,
    XBACON;

    public static TipoHamburguer getTipoHamburguer(Integer id) {
        if (id == 1) {
            return XBURGUER;
        }
        return XBACON;
    }
}
