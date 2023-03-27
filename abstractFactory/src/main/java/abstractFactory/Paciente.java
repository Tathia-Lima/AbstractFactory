package abstractFactory;

public class Paciente {

    private Prontuario prontuario;
    private Receita receita;

    public Paciente(FabricaAbstrata fabrica) {
        this.prontuario = fabrica.criarProntuario();
        this.receita = fabrica.criarReceita();
    }

    public String emitirProntuario() {
        return this.prontuario.emitir();
    }

    public String emitirReceita() {
        return this.receita.emitir();
    }
}