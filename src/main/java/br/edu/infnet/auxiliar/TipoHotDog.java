package br.edu.infnet.auxiliar;

public enum TipoHotDog {

    SALSICHA,
    LINGUICA;

    public static TipoHotDog getTipoHotDog(Integer codigo) {
        if (codigo == 1) {
            return SALSICHA;
        }
        return LINGUICA;
    }
}
