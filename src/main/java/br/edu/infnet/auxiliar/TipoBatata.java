package br.edu.infnet.auxiliar;

public enum TipoBatata {

    BATATA_SIMPLES,
    BATATA_MALUCA;

    public static TipoBatata getTipoBatata(Integer codigo) {
        if (codigo == 1) {
            return BATATA_SIMPLES;
        }
        return BATATA_MALUCA;
    }
}
