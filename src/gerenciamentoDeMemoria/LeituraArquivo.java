package gerenciamentoDeMemoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeituraArquivo {

    private ArrayList<Processo> processos = new ArrayList();

    public ArrayList<Processo> carregarProcessos() {

        char[] letras = "ABCDE".toCharArray();

        try {
            String caminho = new File(".").getCanonicalPath() + "\\src\\gerenciamentoDeMemoria\\espacoDeMemoria.txt";
            File arquivo = new File(caminho);
            FileReader leitor = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(leitor);

            String s = null;
            int n = 0;

            while ((s = buffer.readLine()) != null) {
                processos.add(new Processo("Processo " + letras[n], Integer.parseInt(s), 0, 0));
                n++;
            }

            buffer.close();
            return processos;

        } catch (IOException ex) {
            Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
}
