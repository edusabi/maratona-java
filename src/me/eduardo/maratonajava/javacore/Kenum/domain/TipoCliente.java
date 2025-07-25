package me.eduardo.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    private final int VALOR;
    private String nomeRelatorio;


    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
