package models;

import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map
import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)
import utils.IoTTag;

public class Mercadorias {

    private String id;
    private String descricao;
    private String tipo; //podem ser normais, frágeis ou perecíveis.
    private double peso;
    private double volume;
    private IoTTag tag; //permite identificar a sua localização.

    /*
     mercadoria frágil -> não deve ser movimentada internamente num armazém juntamente com outras mercadorias E deve ser movimentada para
fora do armazém em meio de transporte especial.
    ma mercadoria perecível -> deve ter em consideração eventuais datas de validade para que mercadorias perecíveis do
mesmo tipo sejam escoadas do armazém por ordem dessa data, evitando assim que as mesmas fiquem estragadas.
Nesse caso até devem ser movimentadas para um armazém de reciclagem por transporte especial.
    /*Sempre que uma mercadoria é mudada de local dentro do armazém ou sai do armazém para
    um meio de transporte externo, o sistema terá capacidade de detetar e atualizar a localização
    da mercadoria.*/

    // Métodos para associar tags IoT e rastrear mercadorias
    //Construtor
    public Mercadorias(String id, String descricao, String tipo, double peso, double volume, IoTTag tag) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.peso = peso;
        this.volume = volume;
        this.tag = tag;
    }
    //Getters e Setters:
    //Id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //Descricao

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //Tipo

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //Peso

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Volume

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    //Tag

    public IoTTag getTag() {
        return tag;
    }

    public void setTag(IoTTag tag) {
        this.tag = tag;
    }

    //ToString
    @Override
    public String toString() {
        return "Mercadoria{"
                + "id='" + id + '\''
                + ", descricao='" + descricao + '\''
                + ", tipo ='" + tipo + '\''
                + ", peso=" + peso
                + ", volume=" + volume
                + ", tag=" + tag.getTagId()
                + '}';
    }

}
