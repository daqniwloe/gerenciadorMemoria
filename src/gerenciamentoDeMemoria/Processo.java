package gerenciamentoDeMemoria;

import java.util.ArrayList;

public class Processo {

    private String nomeProcesso;
    private int valorProcesso;
    private int regBase;
    private int regLimite;
    private ArrayList<Processo> processos;

    public Processo() {
        carregar();
    }

    public Processo(String nomeProcesso, int valorProcesso, int regBase, int regLimite) {
        this.nomeProcesso = nomeProcesso;
        this.valorProcesso = valorProcesso;
        this.regBase = regBase;
        this.regLimite = regLimite;
    }

    public int getRegBase() {
        return regBase;
    }

    public void setRegBase(int regBase) {
        this.regBase = regBase;
    }

    public int getRegLimite() {
        return regLimite;
    }

    public void setRegLimite(int regLimite) {
        this.regLimite = regLimite;
    }

    public String getNomeProcesso() {
        return nomeProcesso;
    }

    public void setNomeProcesso(String nomeProcesso) {
        this.nomeProcesso = nomeProcesso;
    }

    public int getValorProcesso() {
        return valorProcesso;
    }

    public void setValorProcesso(int valorProcesso) {
        this.valorProcesso = valorProcesso;
    }

    public void carregar() {
        LeituraArquivo la = new LeituraArquivo();
        processos = la.carregarProcessos();
    }
    
    public Processo obterProcesso(String nomeDoProcesso) {
        for(Processo processo : processos) {
            if (processo.getNomeProcesso().equals(nomeDoProcesso)) {
                return processo;
            }
        } 
        return null;
    }

}
