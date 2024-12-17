package services;
import java.io.*;
import java.util.List;
import models.Armazens;
import models.Mercadorias;


public class GestaoDeDados {

    // Guardar lista de armazéns num ficheiro de texto
    public static void guardarArmazens(List<Armazens> armazens, String caminhoFicheiro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))) {
            for (Armazens armazem : armazens) {
                writer.write(armazem.toString()); // Usa o toString da classe Armazens
                writer.newLine();
            }
            System.out.println("Armazéns guardados com sucesso em " + caminhoFicheiro);
        } catch (IOException e) {
            System.out.println("Erro ao guardar armazéns: " + e.getMessage());
        }
    }

    // Carregar lista de armazéns de um ficheiro de texto
    public static void carregarArmazens(String caminhoFicheiro, List<Armazens> armazens) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoFicheiro))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Divide a linha e cria um objeto Armazens (ajusta conforme o teu formato)
                String[] partes = linha.split(","); // Exemplo: "nome,morada,peso,volume"
                String nome = partes[0];
                String morada = partes[1];
                double maxPeso = Double.parseDouble(partes[2]);
                double maxVolume = Double.parseDouble(partes[3]);

                armazens.add(new Armazens(nome, morada, maxPeso, maxVolume));
            }
            System.out.println("Armazéns carregados com sucesso de " + caminhoFicheiro);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao carregar armazéns: " + e.getMessage());
        }
    }

    // Guardar lista de mercadorias num ficheiro de texto
    public static void guardarMercadorias(List<Mercadorias> mercadorias, String caminhoFicheiro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoFicheiro))) {
            for (Mercadorias mercadoria : mercadorias) {
                writer.write(mercadoria.toString()); // Usa o toString da classe Mercadorias
                writer.newLine();
            }
            System.out.println("Mercadorias guardadas com sucesso em " + caminhoFicheiro);
        } catch (IOException e) {
            System.out.println("Erro ao guardar mercadorias: " + e.getMessage());
        }
    }

    // Carregar lista de mercadorias de um ficheiro de texto
    public static void carregarMercadorias(String caminhoFicheiro, List<Mercadorias> mercadorias) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoFicheiro))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Divide a linha e cria um objeto Mercadorias (ajusta conforme o teu formato)
                String[] partes = linha.split(","); // Exemplo: "id,descricao,tipo,peso,volume"
                String id = partes[0];
                String descricao = partes[1];
                String tipo = partes[2];
                double peso = Double.parseDouble(partes[3]);
                double volume = Double.parseDouble(partes[4]);

                mercadorias.add(new Mercadorias(id, descricao, tipo, peso, volume, null)); // Sem IoTTag
            }
            System.out.println("Mercadorias carregadas com sucesso de " + caminhoFicheiro);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao carregar mercadorias: " + e.getMessage());
        }
    }
}
