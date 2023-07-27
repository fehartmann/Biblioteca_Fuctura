package br.com.fuctura.biblioteca.models;

import br.com.fuctura.biblioteca.enuns.Tamanho;
import lombok.*;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
    private String texto;

    private Tamanho tamanho;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}

