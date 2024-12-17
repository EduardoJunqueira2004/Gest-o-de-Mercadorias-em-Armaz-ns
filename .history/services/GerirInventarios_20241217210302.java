package services;
import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map

import models.Armazens;
import models.Mercadorias;

import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)


//gestão geral dos armazéns e mercadorias
public class GerirInventarios {
    private List<Armazens> armazens;

    public GerirInventarios(){
        this.armazens = new ArrayList<>();
    }
    
    public void registarArmazem(Armazens armazens) { 
        

     }

    public Armazens encontrarArmazemPorNome(String nome) { 
        for (Armazens a : armazens){
            if(a.getNome().equalsIgnoreCase(nome)){
                return a;
            }
        }
        return null;//se não encontrar retorna null

     }

    public boolean moverMercadorias(Armazens origem, Armazens destino, Mercadorias mercadorias) { 
        if (origem.getMercadoriasList().contains(mercadorias)){
            if(destino.podeArmazenar(mercadorias)){
                origem.getMercadoriasList().remove(mercadorias);
                destino.armazenarMercadoria(mercadorias);
                return true;
            }
        }
        return false;
    }
}
