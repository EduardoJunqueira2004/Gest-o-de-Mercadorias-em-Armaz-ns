package services; // Declara que esta classe faz parte do pacote services.

import java.io.*; // Importa classes para operações de ficheiros.
import java.util.List; // Importa a interface List.

import models.Armazens; // Importa a classe Armazens do pacote models.
import models.Mercadorias; // Importa a classe Mercadorias do pacote models.

public class GestaoDeDados {

    // Método para guardar a lista de armazéns num ficheiro de texto.
    public static void guardarArmazens(List<Armazens> armazens, String caminhoFicheiro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))) {
            for (Armazens armazem : armazens) { // Itera sobre todos os armazéns.
                writer.write(armazem.toString()); // Escreve o toString de cada armazém no ficheiro.
                writer.newLine(); // Adiciona uma nova linha.
            }
            System.out.println("Armazéns guardados com sucesso em " + caminhoFicheiro);
        } catch (IOException e) { // Captura exceções relacionadas a ficheiros.
            System.out.println("Erro ao guardar armazéns: " + e.getMessage());
        }
    }

    // Método para carregar a lista de armazéns a partir de um ficheiro de texto.
    public static void carregarArmazens(String caminhoFicheiro, List<Armazens> armazens) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoFicheiro))) {
            String linha;
            while ((linha = reader.readLine()) != null) { // Lê cada linha do ficheiro.
                // Divide a linha e cria um objeto Armazens.
                String[] partes = linha.split(","); // Assume que os valores estão separados por vírgulas.
                String nome = partes[0];
                String morada = partes[1];
                double maxPeso = Double.parseDouble(partes[2]);
                double maxVolume = Double.parseDouble(partes[3]);

                armazens.add(new Armazens(nome, morada, maxPeso, maxVolume)); // Adiciona à lista.
            }
            System.out.println("Armazéns carregados com sucesso de " + caminhoFicheiro);
        } catch (IOException | NumberFormatException e) { // Captura erros de ficheiro e formato.
            System.out.println("Erro ao carregar armazéns: " + e.getMessage());
        }
    }

    // Método para guardar a lista de mercadorias num ficheiro de texto.
    public static void guardarMercadorias(List<Mercadorias> mercadorias, String caminhoFicheiro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))) {
            for (Mercadorias m : mercadorias) { // Itera sobre todas as mercadorias.
                writer.write(m.toString()); // Escreve o toString de cada mercadoria no ficheiro.
                writer.newLine(); // Adiciona uma nova linha.
            }
            System.out.println("Mercadorias guardadas com sucesso em " + caminhoFicheiro);
        } catch (IOException e) { // Captura exceções relacionadas a ficheiros.
            System.out.println("Erro ao guardar mercadorias: " + e.getMessage());
        }
    }

    // Método para carregar a lista de mercadorias a partir de um ficheiro de texto.
    public static void carregarMercadorias(String caminhoFicheiro, List<Mercadorias> mercadorias) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoFicheiro))) {
            String linha;
            while ((linha = reader.readLine()) != null) { // Lê cada linha do ficheiro.
                // Divide a linha e cria um objeto Mercadorias.
                String[] partes = linha.split(","); // Assume que os valores estão separados por vírgulas.
                String id = partes[0];
                String descricao = partes[1];
                String tipo = partes[2];
                double peso = Double.parseDouble(partes[3]);
                double volume = Double.parseDouble(partes[4]);

                mercadorias.add(new Mercadorias(id, descricao, tipo, peso, volume, null)); // Adiciona à lista.
            }
            System.out.println("Mercadorias carregadas com sucesso de " + caminhoFicheiro);
        } catch (IOException | NumberFormatException e) { // Captura erros de ficheiro e formato.
            System.out.println("Erro ao carregar mercadorias: " + e.getMessage());
        }
    }
}
