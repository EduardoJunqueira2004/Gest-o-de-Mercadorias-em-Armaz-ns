import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Armazens> armazens = new ArrayList<>();
    private static List<Mercadorias> mercadorias = new Arraylist<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int opcao;
        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();//Limpa buffer
            processarOpcao(opcao);
        }while (opcao != 0);
        System.out.println("Aplicaççao encerrada.");

    }
    private static void mostrarMenu(){
        System.out.println("||\n  ==== Gestão de Mercadorias em Armazens ====    ||");
        System.out.println("||              1. Criar Armazéns                    ||");
        System.out.println("||              2. Listar Armazéns                   ||");
        System.out.println("||              3. Criar Mercadoria                  ||");
        System.out.println("||              4. Listar Mercadorias                ||");
        System.out.println("||              5. Associar mercadoria ao Armazem    ||");
        System.out.println("||              6. Gerar Relatorio do Armazem        ||");   
        System.out.println("||              7. Guardar Dados                     ||");
        System.out.println("||              8. Carregar Dados                    ||");
        System.out.println("||              0. Sair                              ||");
        System.out.println("||              Escolha uma opcao:                   ||");
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
            associarMercadorias();
            break;
            case 6:
            gerarRelatorioArmazem();
            break;
            case 7:
            guardarDados();
            break;
            case 8:
            carregarDados();
            break;
            case 0:
            break;
            default:
            System.out.println("Opcao invalida.Tente Novamente porfavor.");
        }
    }
    //Criar Armazem Case1
    private static void criarArmazem(){
        System.out.print("Nome do armazem: ");
        String nome = scanner.nextLine();
        System.out.print("Morada: ");
        String morada = scanner.nextLine();
        System.out.print("peso maximo: ");
        double peso = scanner.nextDouble();
        System.out.println("Volume maximo: ");
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
        System.out.print("DEscricao: ");
        String descricao = scanner.nextLine();
        System.out.print("Tipo (normal/frágil/perecivel): ");
        String tipo = scanner.nextLine();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Volume: ");
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
        System.out.print("Nome do Armazém: ");
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
        system.out.println("ID da Mercadoria: ");
        String id = scanner.nextLine();
        


    }
    //Gerar Relatorio do Armazem Case6
    private static void gerarRelatorioArmazem(){
    }
    //Guardar Dados Case7
    private static void guardarDados(){
    }
    //Carregar Dados Case8
    private static void carregarDados(){
    }

    
}
