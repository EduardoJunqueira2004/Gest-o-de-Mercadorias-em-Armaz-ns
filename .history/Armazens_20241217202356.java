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
//Lista de mercadorias armazenadas no armazem 
    private List<Mercadorias> mercadoriasList;
    
   //Construtor
   public Armazens(String nome,String morada,double maxPeso,double maxVolume){
       this.nome = nome;
       this.morada = morada;
       this.maxPeso = maxPeso;
       this.maxVolume = maxVolume;
       mercadoriasList = new ArrayList<Mercadorias>();
   }

   //Getters e Setters:

   //Nome
    public String getNome(){
         return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //Morada
    public String getMorada(){
        return morada;
    }
    public void setMorada(String morada){
        this.morada = morada;
    }
    //MaxPeso
    public double getMaxPeso(){
        return maxPeso;
    }
    public void setMaxPeso(double maxPeso){
        this.maxPeso = maxPeso;
    }
    //MaxVolume
    public double getMaxVolume(){
        return maxVolume;
    }
    public void setMaxVolume(double maxVolume){
        this.maxVolume = maxVolume;
    }
    //MercadoriasList
    public List<Mercadorias> getMercadoriasList(){
        return mercadoriasList;
    }

    //Método para verificar se o armazém tem capacidade para armazenar uma mercadoria ver que ainda estou com erros aqui!
    public boolean podeArmazenar(Mercadorias m){
        double pesoAtual = mercadoriasList.stream().mapToDouble(Mercadorias::getPeso).sum();
        double volumeAtual = mercadoriasList.stream().mapToDouble(Mercadorias::getVolume).sum();
        return (pesoAtual + m.getPeso() <= maxPeso && volumeAtual + m.getVolume() <= maxVolume);

    }
    // Método para armazenar mercadoria
    public void armazenarMercadoria(Mercadorias m){
        if(podeArmazenar(m)){
            mercadoriasList.add(m);
            return true;
        }
        return false;
    }
    // toString() para imprimir informações do armazém
    @Override
    public String toString(){
        return "Armazem{"+
        "nome='" + nome + '\'' +
        ", morada=' " + morada + '\''+
        ", maxPeso=" + maxPeso +
        ", maxVolume=" + maxVolume +
        ", mercadorias=" + mercadoriasList.size() +
        '}';
    }
}
