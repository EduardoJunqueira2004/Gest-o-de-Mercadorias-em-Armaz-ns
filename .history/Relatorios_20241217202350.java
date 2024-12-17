import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


//Gera relatórios sobre o estado do armazém, movimentação de mercadorias, capacidade usada, etc em fixeiro txt


public class Relatorios {

    //Relatórios das mercadorias de um armazém
    public void criarRelatorioArmazens(Armazens armazens, String caminhoFicheiro) { 
        
        //Try Catch para criar o ficheiro
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))){
            writer.write("Relatorio do armazem: " +armazem.getNome()+ "\n");
            writer.write("Morada: " + armazem.getMorada() +"\n");
            writer.write("Capacidade Maxima: Peso=" + armazem.getMaxPeso() +"\n");
            writer.write("Mercadorias Atuais:\n");

            List<Mercadorias> mercadorias = armazem.getMercadoriasList();
            for(Mercadorias m : mercadorias){
                writer.write(m.toString() +"\n" );

            }
            writer.write("\nTotal de Mercadorias: " +mercadorias.size() +"\n");
        }
        catch(IOException e){
            System.out.println("Erro ao criar relatorio do armazem: " + e.getMessage());
        }
     }
     //Relatório de uma mercadoriaespecíofica (rastreabilidade)
    public void criarRelatorioMercadorias(Mercadorias mercadorias, String caminhoFicheiro) { 
        //Try Catch para criar o ficheiro
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))){
            writer.write("Relatorio de mercadoria:" + mercadoria.getId() + "\n");
            writer.write("Descricao:" + mercadoria.getDescricao() + "\n");
            writer.write("Tipo:" +mercadoria.getTipo() + "\n");
            writer.write("Peso:" + mercadoria.getPeso()+ "\n");
            writer.write("Localizacao Atual:" +mercadoria.getTag().getLatitude() + ", " + mercadoria.getTag().getLongitude() + "\n");

        }
        catch(IOException e){
            System.out.println("Erro ao criar relatorio da mercadoria: " + e.getMessage());
        }

     }
}
