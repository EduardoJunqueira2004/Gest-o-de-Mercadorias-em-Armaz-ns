import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map
import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)

public class Transportes {
    private String tipo; // interno ou externo
    private String id;
    private double capacidade; //capacidade de transporte limitada por peso e volume
    
    
    //NOTA: O transporte de uma mercadoria para um armazém de reciclagem apenas pode ser efetuado por um transporte especial.
    public boolean podeCarregar(Mercadorias mercadorias) {

    }
       
}
