package utils; // Declara que esta classe faz parte do pacote utils.

//import java.util.List;         // Importa a interface List, caso necessário.
//import java.util.ArrayList;    // Importa a classe ArrayList para listas dinâmicas.
//import java.util.HashMap;      // Importa a classe HashMap para estruturas chave-valor.
//import java.util.Map;          // Importa a interface Map.
//import java.util.Date;         // Importa a classe Date para manipulação de datas.
//import java.io.*;              // Importa classes para operações de entrada e saída de ficheiros.
//import java.text.SimpleDateFormat; // Importa a classe SimpleDateFormat para formatar datas.

public class IoTTag {
    private String tagId; // Identificador único da tag IoT.
    private double latitude; // Latitude para a localização da tag.
    private double longitude; // Longitude para a localização da tag.

    // Construtor para inicializar os atributos da tag.
    public IoTTag(String tagId, double latitude, double longitude) {
        this.tagId = tagId; // Define o identificador da tag.
        this.latitude = latitude; // Define a latitude.
        this.longitude = longitude; // Define a longitude.
    }

    // Método Getter para obter o ID da tag.
    public String getTagId() {
        return tagId;
    }

    // Método Setter para definir o ID da tag.
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    // Método Getter para obter a latitude.
    public double getLatitude() {
        return latitude;
    }

    // Método Setter para definir a latitude.
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    // Método Getter para obter a longitude.
    public double getLongitude() {
        return longitude;
    }

    // Método Setter para definir a longitude.
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Método para atualizar a localização da tag com novas coordenadas.
    public void updateLocation(double newlatitude, double newlongitude) {
        this.latitude = newlatitude; // Atualiza a latitude.
        this.longitude = newlongitude; // Atualiza a longitude.
    }

    // Método toString para representar a tag IoT como uma string.
    @Override
    public String toString() {
        return "IoTTag{" +
                "tagId='" + tagId + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
