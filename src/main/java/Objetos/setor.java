package Objetos;

public class setor {
    public String Valvulado;
    public String CorteSolda;
    public String Flexo;
    public String Extrusao;
    public String Recuperadora;

    public setor(String valvulado, String corteSolda, String flexo, String extrusao, String recuperadora) {
        Valvulado = valvulado;
        CorteSolda = corteSolda;
        Flexo = flexo;
        Extrusao = extrusao;
        Recuperadora = recuperadora;
    }

    public String getValvulado() {
        return Valvulado;
    }

    public void setValvulado(String valvulado) {
        Valvulado = valvulado;
    }

    public String getCorteSolda() {
        return CorteSolda;
    }

    public void setCorteSolda(String corteSolda) {
        CorteSolda = corteSolda;
    }

    public String getFlexo() {
        return Flexo;
    }

    public void setFlexo(String flexo) {
        Flexo = flexo;
    }

    public String getExtrusao() {
        return Extrusao;
    }

    public void setExtrusao(String extrusao) {
        Extrusao = extrusao;
    }

    public String getRecuperadora() {
        return Recuperadora;
    }

    public void setRecuperadora(String recuperadora) {
        Recuperadora = recuperadora;
    }
}
