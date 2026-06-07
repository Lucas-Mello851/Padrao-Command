package padroescomportamentais.command;

public class Lampada {

    private String comodo;
    private String situacao;

    public Lampada(String comodo) {
        this.comodo = comodo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void acender() {
        this.situacao = "Lampada acesa";
    }

    public void apagar() {
        this.situacao = "Lampada apagada";
    }
}
