package Objetos;

import jakarta.persistence.*;
import lombok.*;
import produtos.DadosProdutos;
import produtos.Solda;

@Table(name= "bobina")
@Entity(name= "bobinas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of= "id")
public class bobinas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Solda solda;
    private int altura;
    private int largura;
    private int lote;
    private String entrega;
    private int quantidade;

    public bobinas(DadosProdutos dados) {
        this.nome= dados.nome();
        this.solda=dados.solda();
        this.altura= dados.altura();
        this.largura= dados.largura();
        this.lote= dados.lote();
        this.entrega= dados.entrega();
        this.quantidade= dados.quantidade();
    }
}



