package br.edu.unifil.lp1.consulta.visao;
import br.edu.unifil.lp1.consulta.controle.CadastroDeConsultas;
import java.util.Scanner;
public class SistemaDaClinica
{   
    static void getMenu(){
        System.out.println("Menu: ");
        System.out.println("[1] - Cadastrar nova consulta");
        System.out.println("[2] - Listar consultas por plano");
        System.out.println("[3] - Listar quantidade de consultas por plano");
        System.out.println("[4] - Valor total pro plano");
        System.out.println("[9] - Encerrar sessão");
    }
    public static void main(String args[]){
        // Binds
        int menu = 0;
        // Instances
        Scanner teclado = new Scanner(System.in);
        CadastroDeConsultas controle = new CadastroDeConsultas();
        getMenu();
        
        while(menu != 9){
            menu = teclado.nextInt();
            teclado.nextLine();
            switch(menu){
                case 1:  
                    controle.cadastrar();
                    controle.consultaIsValid();
                    getMenu();
                    break;
                case 2:
                    System.out.println("Nome do Plano: ");
                    String nomePlano = teclado.nextLine();
                    System.out.println(controle.getConsultaPorPlano(nomePlano));
                    break;
                case 3:
                    System.out.println("Nome do Plano: ");
                    String plano = teclado.nextLine();
                    System.out.println(controle.getNumeroDeConsultas(plano));
                    break;
                case 4:
                    System.out.println("Nome do Plano: ");
                    String nomeDoPlano = teclado.nextLine();
                    System.out.println(controle.getValorTotal(nomeDoPlano));
                    break;
                case 9:
                    System.out.println("Até logo!");
                    break;
                default:
                    getMenu();
                    break;
            }
        }
    }
}
