package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutomacaoTest {

    Automacao automacao;
    Lampada lampada;

    @BeforeEach
    void setUp() {
        automacao = new Automacao();
        lampada = new Lampada("Sala");
    }

    @Test
    void deveAcenderLampada() {
        Comando acenderLampada = new AcenderLampadaComando(lampada);
        automacao.executarComando(acenderLampada);

        assertEquals("Lampada acesa", lampada.getSituacao());
    }

    @Test
    void deveApagarLampada() {
        Comando apagarLampada = new ApagarLampadaComando(lampada);
        automacao.executarComando(apagarLampada);

        assertEquals("Lampada apagada", lampada.getSituacao());
    }

    @Test
    void deveCancelarApagarLampada() {
        Comando acenderLampada = new AcenderLampadaComando(lampada);
        Comando apagarLampada = new ApagarLampadaComando(lampada);

        automacao.executarComando(acenderLampada);
        automacao.executarComando(apagarLampada);

        automacao.cancelarUltimoComando();

        assertEquals("Lampada acesa", lampada.getSituacao());
    }

}
