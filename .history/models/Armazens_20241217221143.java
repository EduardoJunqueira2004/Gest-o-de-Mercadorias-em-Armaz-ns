package models; // Declara que esta classe faz parte do pacote models.

import java.util.ArrayList; // Importa ArrayList para listas dinâmicas.
import java.util.List;      // Importa a interface List.

public class Armazens {
    private String nome; // Nome do armazém.
    private String morada; // Morada do armazém.
    private double maxPeso; // Capacidade máxima de peso.
    private double maxVolume; // Capacidade máxima de volume.
    private List<Mercadorias> mercadoriasList; // Lista de mercadorias armazenadas.

    // Construtor para inicializar o armazém.
    public Armazens(String nome, String morada, double maxPeso, double maxVolume) {
        this.nome = nome;
        this.morada = morada;
        this.maxPeso = maxPeso;
        this.maxVolume = maxVolume;
        this.mercadoriasList = new ArrayList<>();
    }

    // Getters e Setters para os atributos.
    public String getNome() { return nome; }
    public String getMorada() { return morada; }
    public List<Mercadorias> getMercadoriasList() { return mercadoriasList; }

    // Método para verificar se o armazém tem capacidade para armazenar uma mercadoria.
    public boolean podeArmazenar(Mercadorias m) {
        double pesoAtual = mercadoriasList.stream().mapToDouble(Mercadorias::getPeso).sum();
        double volumeAtual = mercadoriasList.stream().mapToDouble(Mercadorias::getVolume).sum();
        return (pesoAtual + m.getPeso() <= maxPeso && volumeAtual + m.getVolume() <= maxVolume);
    }

    // Método para armazenar uma mercadoria no armazém.
    public boolean armazenarMercadoria(Mercadorias m) {
        if (podeArmazenar(m)) {
            mercadoriasList.add(m);
            return true;
        }
        return false;
    }

    // Método toString para representar o armazém como uma string.
    @Override
    public String toString() {
        return "Armazém{" +
                "nome='" + nome + '\'' +
                ", morada='" + morada + '\'' +
                ", maxPeso=" + maxPeso +
                ", maxVolume=" + maxVolume +
                ", mercadorias=" + mercadoriasList.size() +
                '}';
    }
}
