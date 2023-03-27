package abstractFactory;


public class FabricaConsultorio implements FabricaAbstrata {

    @Override
    public Prontuario criarProntuario() {
        return new ProntuarioUTI();
    }

    @Override
    public Receita criarReceita() {
        return new ReceitaUTI();
    }
}