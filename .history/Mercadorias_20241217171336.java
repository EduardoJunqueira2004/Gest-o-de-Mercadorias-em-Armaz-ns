import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map
import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)


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
        

}



