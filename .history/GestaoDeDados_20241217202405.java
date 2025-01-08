import java.util.List;         // Para listas (ArrayList, LinkedList)
import java.util.ArrayList;    // Para implementar List (pode ser usada em Goods, Warehouse, etc.)
import java.util.HashMap;      // Para mapas de dados (caso precise de mapeamento chave-valor)
import java.util.Map;          // Para o tipo Map
import java.util.Date;         // Para manipulação de datas (caso precise de timestamps para movimentação)
import java.io.*;              // Para entrada e saída de arquivos
import java.lang.reflect.Type;
import java.text.SimpleDateFormat; // Para formatação de datas em relatórios (se necessário)
import com.google.gson.Gson;             // Para converter objetos Java em JSON e vice-versa
import com.google.gson.reflect.TypeToken; // Para manipulação de tipos genéricos com Gson
import models.Armazens;
import models.Mercadorias;

//Guardar e carregar dados de armazéns, mercadorias, transportes, etc, em FICHEIROS DE TEXTO
public class GestaoDeDados {

    private static final Gson gson =  new Gson();

    //Guarder lista de armazéns num ficheiro JSON
    public  static void guardarArmazens(List<Armazens> armazens, String caminhoFicheiro) {

        try(Writer writer= new FileWriter(caminhoFicheiro)){
            gson.toJson(armazens, writer);
            System.out.println("Armazens guardados com sucesso em " + caminhoFicheiro);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro ao guardar armazens: " + e.getMessage());

        }
    }
    //Carregar lista de armazéns de um ficheiro JSON
    public static List<Armazens> carregarArmazens(String String caminhoFicheiro) {
        //Try Catch para apanhar exceções
        try(Reader reader = new FileReader(caminhoFicheiro)) {
            Type listType = new TypeToken<List<Armazens>>(){}.getType();
            return gson.fromJson(reader, listType);

        }
        catch(IOException e){
            System.out.println("Erro ao carregar armazens:" +e.getMessage());
            return null;

        }
    }

    //Guardar listas de mercadorias num ficheiro JSON
    public static void guardarMercadorias(List<Mercadorias> mercadorias, String caminhoFicheiro){
        //try catch para  exceções
        try(Writer writer = new FileWriter(caminhoFicheiro)){
            gson.toJson(mercadorias,writer);
            System.out.println("Mercadorias guardadas com sucesso em "+caminhoFicheiro);
        }
        catch(IOExeption e){
            System.out.println("Erro ao guardar mercadorias: "+ e.getMessages());

        }
    }

    //Carregar listas de mercadorias de um ficheiro JSON
    public static List<Mercadorias> carregarDadosMercadorias(String MercadoriasNome) {
        try(Reader reader = new FileReader(caminhoFicheiro)){
            Type listType = new  TypeToken<List<Mercadorias>>(){}.getType();
            return gson.fromJson(reader,listType);
        }
        catch(IOException e){
            System.out.println("Erro ao carregar mercadorias: "+e.getMessage());

        }

    }


}
