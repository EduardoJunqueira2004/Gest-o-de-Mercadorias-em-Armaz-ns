// Declaração do pacote onde a classe Armazens está localizada
package models;

// Importa a classe ArrayList para criar listas dinâmicas
import java.util.ArrayList;
// Importa a interface List para manipulação de listas
import java.util.List;

// Definição da classe Armazens que representa um armazém
public class Armazens {
    // Atributos privados da classe para encapsulamento
    private String nome; // Nome do armazém
    private String morada; // Morada do armazém
    private double maxPeso; // Capacidade máxima de peso do armazém
    private double maxVolume; // Capacidade máxima de volume do armazém
    private List<Mercadorias> mercadoriasList; // Lista de mercadorias armazenadas

    // Construtor da classe que inicializa os atributos
    public Armazens(String var1, String var2, double var3, double var5) {
        this.nome = var1; // Inicializa o nome do armazém
        this.morada = var2; // Inicializa a morada do armazém
        this.maxPeso = var3; // Inicializa a capacidade máxima de peso
        this.maxVolume = var5; // Inicializa a capacidade máxima de volume
        this.mercadoriasList = new ArrayList<Mercadorias>();

    }

    // Método Getter para obter o nome do armazém
    public String getNome() {
        return this.nome;
    }

    // Método Setter para definir o nome do armazém
    public void setNome(String var1) {
        this.nome = var1;
    }

    // Método Getter para obter a morada do armazém
    public String getMorada() {
        return this.morada;
    }

    // Método Setter para definir a morada do armazém
    public void setMorada(String var1) {
        this.morada = var1;
    }

    // Método Getter para obter a capacidade máxima de peso
    public double getMaxPeso() {
        return this.maxPeso;
    }

    // Método Setter para definir a capacidade máxima de peso
    public void setMaxPeso(double var1) {
        this.maxPeso = var1;
    }

    // Método Getter para obter a capacidade máxima de volume
    public double getMaxVolume() {
        return this.maxVolume;
    }

    // Método Setter para definir a capacidade máxima de volume
    public void setMaxVolume(double var1) {
        this.maxVolume = var1;
    }

    // Método Getter para obter a lista de mercadorias armazenadas no armazém
    public List<Mercadorias> getMercadoriasList() {
        return this.mercadoriasList;
    }

    // Método para verificar se uma mercadoria pode ser armazenada no armazém
    public boolean podeArmazenar(Mercadorias var1) {
        // Calcula o peso atual somando o peso de todas as mercadorias armazenadas
        double var2 = this.mercadoriasList.stream().mapToDouble(Mercadorias::getPeso).sum();
        // Calcula o volume atual somando o volume de todas as mercadorias armazenadas
        double var4 = this.mercadoriasList.stream().mapToDouble(Mercadorias::getVolume).sum();
        // Verifica se o peso e volume totais não ultrapassam os limites definidos
        return var2 + var1.getPeso() <= this.maxPeso && var4 + var1.getVolume() <= this.maxVolume;
    }

    // Método para armazenar uma mercadoria no armazém
    public boolean armazenarMercadoria(Mercadorias var1) {
        // Verifica se a mercadoria pode ser armazenada
        if (this.podeArmazenar(var1)) {
            this.mercadoriasList.add(var1); // Adiciona a mercadoria à lista
            return true; // Retorna true se a mercadoria for armazenada com sucesso
        } else {
            return false; // Retorna false se a mercadoria não puder ser armazenada
        }
    }

    // Método toString para representar o armazém como uma string
    public String toString() {
        String var10000 = this.nome; // Obtém o nome do armazém
        // Retorna uma string formatada com os detalhes do armazém
        return "Armazem{nome='" + var10000 + "', morada=' " + this.morada + "', maxPeso=" 
                + this.maxPeso + ", maxVolume=" + this.maxVolume 
                + ", mercadorias=" + this.mercadoriasList.size() + "}";
    }
}
