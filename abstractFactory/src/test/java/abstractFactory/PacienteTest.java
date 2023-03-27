package abstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {


    @Test
    public void testEmitirProntuarioClinico() {
        FabricaAbstrata fabrica = new FabricaClinica();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Prontuário Clínico", paciente.emitirProntuario());
    }

    @Test
    public void testEmitirReceitaMedica() {
        FabricaAbstrata fabrica = new FabricaClinica();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Receita Médica", paciente.emitirReceita());
    }

    @Test
    public void testEmitirProntuarioOdontologico() {
        FabricaAbstrata fabrica = new FabricaConsultorio();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Prontuário Unidade Intensiva de Tratamento - UTI", paciente.emitirProntuario());
    }

    @Test
    public void testEmitirReceitaOdontologica() {
        FabricaAbstrata fabrica = new FabricaConsultorio();
        Paciente paciente = new Paciente(fabrica);
        //String receita = paciente.emitirReceita();
        //assertEquals("Receita Odontológica", receita);
        assertEquals("Receita Unidade de Tratamento Intensivo", paciente.emitirReceita());
    }
}
