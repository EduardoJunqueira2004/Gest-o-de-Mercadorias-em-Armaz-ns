import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map
import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)


public class Armazens {
    private String nome;
    private String morada;
    //dimensoes do armazem
    private double maxPeso; 
    private double maxVolume; 
    //lista de mercadorias
    private List<Mercadorias> mercadoriasList;//Lista de mercadorias armazenadas
    
    //Qualquer armazém pode receber ou expedir mercadorias, exceto os armazéns de reciclagem que apenas recebem mercadorias.
    
    // Métodos para verificar capacidade e armazenar mercadorias
}