package reports; // Declara que esta classe faz parte do pacote reports.

import java.io.BufferedWriter; // Importa BufferedWriter para escrita em ficheiros.
import java.io.FileWriter;     // Importa FileWriter para criar ficheiros.
import java.io.IOException;    // Importa IOException para lidar com erros de ficheiro.
import java.util.List;         // Importa a interface List.

import models.Armazens;        // Importa a classe Armazens.
import models.Mercadorias;     // Importa a classe Mercadorias.

public class Relatorios {

    // Método para gerar um relatório de um armazém.
    public void criarRelatorioArmazens(Armazens armazem, String caminhoFicheiro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))) {
            writer.write("Relatório do Armazém: " + armazem.getNome() + "\n");
            writer.write("Morada: " + armazem.getMorada() + "\n");
            writer.write("Capacidade Máxima: Peso=" + armazem.getMaxPeso() + ", Volume=" + armazem.getMaxVolume() + "\n");
            writer.write("Mercadorias Atuais:\n");

            List<Mercadorias> mercadorias = armazem.getMercadoriasList(); // Obtém a lista de mercadorias.
            for (Mercadorias m : mercadorias) { // Itera sobre as mercadorias.
                writer.write(m.toString() + "\n"); // Escreve a mercadoria no ficheiro.
            }
            writer.write("\nTotal de Mercadorias: " + mercadorias.size() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao criar relatório do armazém: " + e.getMessage());
        }
    }
}
