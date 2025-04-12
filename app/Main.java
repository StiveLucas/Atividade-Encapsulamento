import java.util.ArrayList;
import java.util.Scanner;

import models.Camisa;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Camisa> camisas = new ArrayList<>();

        int codigo;

        do {

            System.out.println("--- Menu ---");
            System.out.println("Código | Descrição");
            System.out.println("  1    | Cadastrar Camisa");
            System.out.println("  2    | Listar Camisas");
            System.out.println("  3    | Alterar Camisas");
            System.out.println("  4    | Remover Camisas");
            System.out.println("  0    | Sair");

            System.out.println("Escolha um código: ");
            codigo = sc.nextInt();
            sc.nextLine();

            switch (codigo) {
                case 1:
                    System.out.println("Cadastrando Camisa.");
                    System.out.println("Digite o código: ");
                    int codigoCamisa = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a cor: ");
                    String cor = sc.nextLine();

                    System.out.println("Digite o tamanho: ");
                    String tamanho = sc.nextLine();

                    System.out.println("Digite tipo: ");
                    String tipo = sc.nextLine();

                    Camisa camisa = new Camisa(cor, tamanho, tipo, codigoCamisa);
                    camisas.add(camisa);

                    System.out.println("Camisa cadastrada.");
                    
                    break;

                case 2:

                    if (camisas.isEmpty()) {
                        System.out.println("Não há camisas cadastradas");
                        
                    }else{
                        System.out.println("Listando camisas");
                        for (Camisa lista : camisas) {
                            lista.exibirInfo();

                        }
                    }

                    break;

                case 3:

                    if (camisas.isEmpty()) {
                        System.out.println("Não há camisas cadastradas");
                        
                    }else{

                        System.out.println("Alterando camisa");
                        System.out.println("Digite o código da camisa: ");
                        int alterarCamisa = sc.nextInt();
                        sc.nextLine();

                        for (Camisa lista : camisas) {

                            if (lista.getCodigoCamisa() == alterarCamisa){
                                System.out.println("Nova cor: ");
                                lista.setCor(sc.nextLine());

                                System.out.println("Novo tamanho: ");
                                lista.setTamanho(sc.nextLine());

                                System.out.println("Novo tipo: ");
                                lista.setTipo(sc.nextLine());

                                System.out.println("Roupa alterada");

                                break;

                            }else{
                                System.out.println("Camisa não encontrada");

                            }
                            
                        }

                    break;

                        }

                case 4:

                    if (camisas.isEmpty()) {
                        System.out.println("Não há camisas cadastradas");
                        
                    }else{

                        System.out.println("Digite o código da camisa que desaja remover: ");
                        int removerCamisa = sc.nextInt();
                        sc.nextLine();
    
                        for (Camisa lista : camisas) {
                            if (lista.getCodigoCamisa() == removerCamisa) {
                                camisas.remove(lista);
    
                                System.out.println("Camisa removida.");
    
                                break;
                            }else{
                                System.out.println("Camisa não encontrada");
    
                            }
                            
                        }

                    }

                    break;

                case 0:

                    System.out.println("Progama sendo finalizado...");
                  
                default:
                    break;
            }
            
        } while (codigo != 0);


        
    }
}