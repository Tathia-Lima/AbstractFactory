package abstractFactory;

public class FabricaClinica implements FabricaAbstrata {

    @Override
    public Prontuario criarProntuario() {
        return new ProntuarioClinico();
    }

    @Override
    public Receita criarReceita() {
        return new ReceitaMedica();
    }
}