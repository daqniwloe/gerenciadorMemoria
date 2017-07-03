package gerenciamentoDeMemoria;

public class Gerenciamento {
    
    private int indice;
    
    public void setValorRegistradores(Processo p) {
    
        p.setRegBase(indice);
        p.setRegLimite(indice + p.getValorProcesso() - 1);
        indice +=  p.getValorProcesso();
    
    }
    
}
