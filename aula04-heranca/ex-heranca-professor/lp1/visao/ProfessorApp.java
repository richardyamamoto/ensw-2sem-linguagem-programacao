package lp1.visao;
import java.util.Scanner;
import lp1.controle.Controle;
public class ProfessorApp{
    static void getMenu(){
        System.out.println("-----------Menu----------- \n");
        System.out.println("[1] - Cadastrar disciplina");
        System.out.println("[2] - Cadastrar professor");
        System.out.println("[3] - Detalhes disciplina");
        System.out.println("[4] - Buscar professor por titulação");
        System.out.println("[5] - Listar disciplinas disponíveis");
        System.out.println("[6] - Listar todos professores");
        System.out.println("[99] - Encerrar");
    }
    public static void main (String args[]){
        // Variaveis
        
        int menu = 0;
        // Instancias
        Scanner teclado = new Scanner(System.in);
        Controle controle = new Controle();
        
        getMenu();
        while(menu != 99){
            menu = teclado.nextInt();
            teclado.nextLine();
            switch(menu){ 
                case 1:
                    System.out.println("Nome da Disciplina: ");
                    String nomeDisciplina = teclado.nextLine(); 
                    System.out.println("Nome do Professor: ");
                    String nomeProfessor = teclado.nextLine();
                    System.out.println("Titulação: ");
                    String titulacao = teclado.nextLine();
                    controle.cadastrarDisciplina(nomeDisciplina, nomeProfessor, titulacao);
                    break;
                case 2: 
                    System.out.println("Nome do Professor: ");
                    String nomeProfessor2 = teclado.nextLine();
                    System.out.println("Titulação: ");
                    String titulacao2 = teclado.nextLine();
                    controle.cadastrarProfessor(nomeProfessor2, titulacao2);
                    break;
                case 3:
                    System.out.println("Nome da Disciplina: ");
                    String nomeDisciplina2 = teclado.nextLine(); 
                    System.out.println(controle.getDisciplina(nomeDisciplina2));
                    break;
                case 4:
                    System.out.println("Titulação: ");
                    String titulacao3 = teclado.nextLine();
                    System.out.println(controle.getProfessorPorTitulacao(titulacao3));
                    break;
                case 5:
                    System.out.println(controle.getTodasDisciplinas());
                    break;
                case 6:
                    System.out.println(controle.getTodosProfessores());
                    break;
                case 99: 
                    System.out.println("Até logo!");
                    break;
                default:
                    getMenu();
                    break;
            }
        }
    }
}
