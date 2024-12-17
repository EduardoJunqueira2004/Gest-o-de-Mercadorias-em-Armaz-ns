package utils;
import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map
import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)

public class IoTTag {
    private String tagId;
    //coordenadas das mercadorias, para as localizar a Tag
    private double latitude;
    private double longitude;
    
    //Construtor
    public IoTTag(String tagId,double latitude,double longitude){
        this.tagId =tagId;
        this.longitude = longitude;
        this.latitude = latitude;

    }
    //Getters e Setters:
    //TagId
    public String getTagId(){
        return tagId;
    }
    public void setTagId(String tagId){
        this.tagId = tagId;
    }
    //Latitude
    public double getLatitude(){
        return latitude;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
        }
    //Longitude
    public double getLongitude(){
        return longitude;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

        
    //Atualizar localização da tag
    public void updateLocation(double newlatitude, double newlongitude) { 
        this.latitude = newlatitude;
        this.longitude = newlongitude;

     }
    //ToString
    @Override
    public String toString(){
        return "IoTTag{" +
        "tagId='" + tagId + '\'' +
        ", latitude=" +latitude +
        ", longitude=" + longitude +
    '}';
    }
}
