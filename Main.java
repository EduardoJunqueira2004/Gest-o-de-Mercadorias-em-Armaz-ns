import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Armazens;
import models.Mercadorias;
import reports.Relatorios;
import services.GestaoDeDados;
import utils.IoTTag;


public class Main {
    private static List<Armazens> armazens = new ArrayList<>();
    private static List<Mercadorias> mercadorias = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int opcao;
        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();//Limpa buffer
            processaropcao(opcao);
        }while (opcao != 0);
        System.out.println("Aplicaççao encerrada.");

    }private static void mostrarMenu(){
        System.out.println("||    ==== Gestao de Mercadorias em Armazens ====    ||");
        System.out.println("||              1. Criar Armazens                    ||");
        System.out.println("||              2. Listar Armazens                   ||");
        System.out.println("||              3. Criar Mercadoria                  ||");
        System.out.println("||              4. Deletar Mercadoria                ||");
        System.out.println("||              5. Criar Transporte de Reciclagem    ||");
        System.out.println("||              6. Associar Mercadoria a Transporte  ||");
        System.out.println("||              7. Listar Transportes                ||");
        System.out.println("||              8. Validar Datas de Mercadorias      ||");
        System.out.println("||              9. Mover Mercadorias Expiradas       ||");
        System.out.println("||              10. Listar Tags das Mercadorias      ||");
        System.out.println("||              11. Listar Percurso da Mercadoria    ||");
        System.out.println("||              12. Gerar Relatorio do Armazem       ||");   
        System.out.println("||              13. Guardar Dados                    ||");
        System.out.println("||              14. Carregar Dados                   ||");
        System.out.println("||              15. Gestao de Tags para Transportes  ||");
        System.out.println("||              0. Sair                              ||");
        System.out.println("||              Escolha uma opçao:                   ||");
        System.out.println("||===================================================||");
    }
    
    
    
    private static void processaropcao(int opcao){
        switch(opcao){
            case 1:
                criarArmazem();
                break;
            case 2:
                listarArmazens();
                break;
            case 3:
                criarMercadoria();
                break;
            case 4:
                listarMercadorias();
                break;
            case 5:
                //criarTransporteReciclagem();--Falta implementar
                break;
            case 6:
                //associarMercadoriaTransporte();--Falta implementar
                break;
            case 7:
                //listarTransportes();--Falta implementar
                break;
            case 8:
                //validarDatasMercadorias();--Falta implementar
                break;
            case 9:
                //moverMercadoriasExpiradas();--Falta implementar
                break;
            case 10:
                listarTagsMercadorias();
                break;
            case 11:
                listarPercursoMercadoria();
                break;
            case 12:
                gerarRelatorioArmazem();
                break;
            case 13:
                guardarDados();
                break;
            case 14:
                carregarDados();
                break;
            case 15:
                //gestaoTagsTransportes();--Falta implementar
                break;
            case 0:
                System.out.println("Aplicação encerrada.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente, por favor.");
        }
    }
    
    //Criar Armazem Case1
    private static void criarArmazem(){
        System.out.print("Nome do Armazem: ");
        String nome = scanner.nextLine();
        System.out.print("Morada: ");
        String morada = scanner.nextLine();
        System.out.print("Peso maximo do conjunto de todas as mercadorias: ");
        double peso = scanner.nextDouble();
        System.out.println("Volume maximo do conjunto de todas as mercadorias: ");
        double volume= scanner.nextDouble();
        armazens.add(new Armazens(nome,morada,peso,volume));
        System.out.println("Armazem criado com sucesso!");

    }
//Listar Armazens Case2
    private static void listarArmazens(){
        if(armazens.isEmpty()){
            System.out.println("Nenhum armazem disponivel.");


        }else{
            for(Armazens a : armazens){
                System.out.println(a);
            }

        }
    }
    //Criar Mercadoria Case3
    private static void criarMercadoria(){
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Descricao da mercadoria IoT: ");
        String descricao = scanner.nextLine();
        System.out.print("Tipo (normal/frágil/perecivel): ");
        String tipo = scanner.nextLine();
        System.out.print("Peso em gramas: ");
        double peso = scanner.nextDouble();
        System.out.print("Volume em : ");
        double volume = scanner.nextDouble();
        System.out.print("Tag ID : ");
        String tagId = scanner.next();
        IoTTag tag = new IoTTag( tagId, 0, 0); //inicia com cordenada (0,0)
        mercadorias.add(new Mercadorias(id,descricao,tipo,peso,volume,tag));
        System.out.println("Mercadorias criadas com sucesso!");
        
    }
    
    //Listar Mercadorias Case4
    private static void listarMercadorias(){
        if(mercadorias.isEmpty()){
            System.out.println("Nenhuma mercadoria disponível");

        }else{
            for(Mercadorias m : mercadorias){
                System.out.println(m);

            }

        }
    }
    //Associar Mercadorias Case5
    private static void associarMercadorias(){
        System.out.print("Nome do Armazem: ");
        String nome = scanner.nextLine();
        Armazens armazem = encontrarArmazemPorNome(nome);
        if(armazem == null){
            System.out.println("Armazem não encontrado.");
            return;

        }
        System.out.print("ID da Mercadoria: ");
        String id = scanner.nextLine();
        Mercadorias mercadoria = encontrarMercadoriaPorId(id);
        if (mercadoria == null){
            System.out.println("Armazem nao encontrado.");
            return;
        }
        System.out.println("ID da Mercadoria: ");
        String Id = scanner.nextLine();
        Mercadorias mercadorias = encontrarMercadoriaPorId(id);
        if(mercadoria == null){
            System.out.println("Mercadoria não encontrada.");
            return;

        }
        if(armazem.armazenarMercadoria(mercadoria)){
            System.out.println("Mercadoria Armazenada com sucesso!");
        }else{
            System.out.println("Armazem sem capacidade para armazenar a mercadoria.");

        }
    }
        //Listar por Nome e por ID
    private static Armazens encontrarArmazemPorNome(String nome) {
        for (Armazens a : armazens) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }


    private static Mercadorias encontrarMercadoriaPorId(String id) {
        for (Mercadorias m : mercadorias) {
            if (m.getId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

     //Listar Percurso da Mercadoria Case6
     private static void listarPercursoMercadoria() {
        System.out.print("ID da Mercadoria: ");
        String id = scanner.nextLine();
    
        Mercadorias mercadoria = encontrarMercadoriaPorId(id);
        if (mercadoria == null) {
            System.out.println("Mercadoria não encontrada.");
            return;
        }
    
        System.out.println("Percurso da Mercadoria:");
        for (Armazens armazem : armazens) {
            if (armazem.getMercadoriasList().contains(mercadoria)) {
                System.out.println("- Armazem: " + armazem.getNome() + ", Morada: " + armazem.getMorada());
            }
        }
    }
    //Listar Tags das Mercadorias Case7   
    private static void listarTagsMercadorias() {
        if (mercadorias.isEmpty()) {
            System.out.println("Nenhuma mercadoria disponível.");
            return;
        }
    
        System.out.println("Tags das Mercadorias:");
        for (Mercadorias m : mercadorias) {
            IoTTag tag = (IoTTag) m.getTag();
            System.out.println("ID: " + m.getId() + ", Tag: " + tag.getId());
        }
    }
    //Gerar Relatorio do Armazem Case8
    private static void gerarRelatorioArmazem(){
        System.out.println("Nome do Armazem: ");
        String nome = scanner.nextLine();   
        Armazens armazem = encontrarArmazemPorNome(nome);
        if(armazem == null)
        {
            System.out.println("Armazem nao encontrado.");
            return;

        }
        System.out.println("Caminho do ficheiro: ");
        String caminho = scanner.nextLine();
        new Relatorios().criarRelatorioArmazens(armazem,caminho);
    }
    //Guardar Dados Case9
    private static void guardarDados(){
        GestaoDeDados.guardarArmazens(armazens,"armazens.json");
        GestaoDeDados.guardarMercadorias(mercadorias,"mercadorias.json");
    }
    //Carregar Dados Case10
    private static void carregarDados() {
        GestaoDeDados.carregarArmazens("armazens.txt", armazens);
        GestaoDeDados.carregarMercadorias("mercadorias.txt", mercadorias);
    }
   
    
}
