package transport; // Declara que esta classe faz parte do pacote transport.

import java.util.List;         // Importa a interface List.
import java.util.ArrayList;    // Importa a classe ArrayList para listas.
import java.util.HashMap;      // Importa a classe HashMap.
import java.util.Map;          // Importa a interface Map.

import models.Mercadorias;     // Importa a classe Mercadorias do pacote models.

import java.util.Date;         // Importa a classe Date.
import java.io.*;              // Importa classes para operações de ficheiros.
import java.text.SimpleDateFormat; // Importa a classe SimpleDateFormat.

public class Transportes {
    private String tipo; // Tipo do transporte: interno ou externo.
    private String id; // Identificador único do transporte.
    private double capacidadePeso; // Capacidade máxima de peso suportada pelo transporte.
    private double capacidadeVolume; // Capacidade máxima de volume suportada pelo transporte.

    // Construtor para inicializar um transporte com ID, tipo, capacidade de peso e volume.
    public Transportes(String id, String tipo, double capacidadePeso, double capacidadeVolume) {
        this.id = id; // Define o identificador do transporte.
        this.tipo = tipo; // Define o tipo do transporte.
        this.capacidadePeso = capacidadePeso; // Define a capacidade de peso.
        this.capacidadeVolume = capacidadeVolume; // Define a capacidade de volume.
    }

    // Método Getter para obter o ID do transporte.
    public String getId() {
        return id;
    }

    // Método Setter para definir o ID do transporte.
    public void setId(String id) {
        this.id = id;
    }

    // Método Getter para obter o tipo do transporte.
    public String getTipo() {
        return tipo;
    }

    // Método Setter para definir o tipo do transporte.
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método Getter para obter a capacidade máxima de peso.
    public double getCapacidadePeso() {
        return capacidadePeso;
    }

    // Método Setter para definir a capacidade máxima de peso.
    public void setCapacidadePeso(double capacidadePeso) {
        this.capacidadePeso = capacidadePeso;
    }

    // Método Getter para obter a capacidade máxima de volume.
    public double getCapacidadeVolume() {
        return capacidadeVolume;
    }

    // Método Setter para definir a capacidade máxima de volume.
    public void setCapacidadeVolume(double capacidadeVolume) {
        this.capacidadeVolume = capacidadeVolume;
    }

    // Método para verificar se o transporte pode carregar uma determinada mercadoria.
    public boolean podeCarregar(Mercadorias m) {
        return m.getPeso() <= capacidadePeso && m.getVolume() <= capacidadeVolume;
    }

    // Método toString para representar o transporte como uma string.
    @Override
    public String toString() {
        return "Transporte{" +
                "id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capacidadePeso=" + capacidadePeso +
                ", capacidadeVolume=" + capacidadeVolume +
                '}';
    }
}
