package padroescomportamentais.command;

public class ApagarLampadaComando implements Comando {

    private Lampada lampada;

    public ApagarLampadaComando(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.apagar();
    }

    public void cancelar() {
        this.lampada.acender();
    }
}
