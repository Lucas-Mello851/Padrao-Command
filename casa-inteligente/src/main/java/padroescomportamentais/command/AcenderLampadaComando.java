package padroescomportamentais.command;

public class AcenderLampadaComando implements Comando {

    private Lampada lampada;

    public AcenderLampadaComando(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.acender();
    }

    public void cancelar() {
        this.lampada.apagar();
    }
}
