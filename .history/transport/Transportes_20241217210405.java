package transport;
import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map

import models.Mercadorias;

import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)

public class Transportes {
    private String tipo; // interno ou externo
    private String id;
    private double capacidadePeso; //capacidade de transporte limitada por peso máximo
    private double capacidadeVolume;//capacidade de transporte Limitada por volume máximo

    //Construtor
    public Transportes(String id, String tipo,double capacidadePeso, double capacidadeVolume){
        this.id = id;
        this.tipo = tipo;
        this.capacidadePeso = capacidadePeso;
        this.capacidadeVolume = capacidadeVolume;

    }

    //Getters e Setters:
    //ID
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    //Tipo
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    //CapacidadePeso
    public double getCapacidadePeso(){
        return capacidadePeso;
    }
    public void setCapacidadePeso(double capacidadePeso){
        this.capacidadePeso = capacidadePeso;
    }
    //CapacidadeVolume
    public double getCapacidadeVolume(){
        return capacidadeVolume;
    }
    public void setCapacidadeVolume(double capacidadeVolume){
        this.capacidadeVolume = capacidadeVolume;
    }

    //Verifica se o transporte pode carregar a mercadoria 
     //NOTA: O transporte de uma mercadoria para um armazém de reciclagem apenas pode ser efetuado por um transporte especial.
    public boolean podeCarregar(Mercadorias m){
        return m.getPeso() <= capacidadePeso && m.getVolume() <= capacidadeVolume;
        
    }
   //ToString
   @Override
   public String toString(){
    return "Transporte{" + 
    "id='" + id +'\'' +
    ", tipo = ' " + tipo + '\''+
    ", capacidadePeso=" + capacidadePeso +
    ", capacidadeVolume=" + capacidadeVolume +
   '}';
       
   }
}