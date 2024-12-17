package services; // Declara que esta classe faz parte do pacote services.

import java.util.ArrayList; // Importa a classe ArrayList para listas.
import java.util.List;      // Importa a interface List.

import models.Armazens;     // Importa a classe Armazens.
import models.Mercadorias;  // Importa a classe Mercadorias.

public class GerirInventarios {
    private List<Armazens> armazens; // Lista de armazéns geridos.

    // Construtor para inicializar a lista de armazéns.
    public GerirInventarios() {
        this.armazens = new ArrayList<>();
    }

    // Método para registar um novo armazém.
    public void registarArmazem(Armazens armazem) {
        this.armazens.add(armazem);
    }

    // Método para encontrar um armazém pelo nome.
    public Armazens encontrarArmazemPorNome(String nome) {
        for (Armazens a : armazens) { // Percorre a lista de armazéns.
            if (a.getNome().equalsIgnoreCase(nome)) { // Compara os nomes (ignorando maiúsculas/minúsculas).
                return a;
            }
        }
        return null; // Retorna null se o armazém não for encontrado.
    }

    // Método para mover uma mercadoria entre armazéns.
    public boolean moverMercadorias(Armazens origem, Armazens destino, Mercadorias mercadoria) {
        if (origem.getMercadoriasList().contains(mercadoria)) { // Verifica se a mercadoria está no armazém de origem.
            if (destino.podeArmazenar(mercadoria)) { // Verifica se o destino tem capacidade.
                origem.getMercadoriasList().remove(mercadoria); // Remove do armazém de origem.
                destino.armazenarMercadoria(mercadoria); // Adiciona ao armazém de destino.
                return true;
            }
        }
        return false; // Retorna false caso a movimentação falhe.
    }
}
