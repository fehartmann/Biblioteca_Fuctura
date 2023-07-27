package br.com.fuctura.biblioteca.enuns;

public enum Tamanho {

    PEQUENO(0),
    MEDIO( 1),
    GRANDE( 2);

    private Integer codido;

    Tamanho(Integer codido) {
        this.codido = codido;
    }
}
