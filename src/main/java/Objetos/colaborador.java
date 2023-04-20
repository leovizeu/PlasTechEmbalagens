package Objetos;

public class colaborador {
    public String nome;
    public Integer idade;
    public Integer codigo;

    public colaborador(String nome, Integer idade, Integer codigo) {
        this.nome = nome;
        this.idade = idade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
