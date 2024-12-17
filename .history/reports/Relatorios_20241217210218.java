package reports;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import models.Armazens;
import models.Mercadorias;


//Gera relatórios sobre o estado do armazém, movimentação de mercadorias, capacidade usada, etc em fixeiro txt


public class Relatorios {

    //Relatórios das mercadorias de um armazém
    public void criarRelatorioArmazens(Armazens armazens, String caminhoFicheiro) { 
        
        //Try Catch para criar o ficheiro
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))){
            writer.write("Relatorio do armazem: " +armazens.getNome()+ "\n");
            writer.write("Morada: " + armazens.getMorada() +"\n");
            writer.write("Capacidade Maxima: Peso=" + armazens.getMaxPeso() +"\n");
            writer.write("Mercadorias Atuais:\n");

            List<Mercadorias> mercadorias = armazens.getMercadoriasList();
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
            writer.write("Relatorio de mercadoria:" + mercadorias.getId() + "\n");
            writer.write("Descricao:" + mercadorias.getDescricao() + "\n");
            writer.write("Tipo:" +mercadorias.getTipo() + "\n");
            writer.write("Peso:" + mercadorias.getPeso()+ "\n");
            writer.write("Localizacao Atual:" +mercadorias.getTag().getLatitude() + ", " + mercadorias.getTag().getLongitude() + "\n");

        }
        catch(IOException e){
            System.out.println("Erro ao criar relatorio da mercadoria: " + e.getMessage());
        }

     }
}
