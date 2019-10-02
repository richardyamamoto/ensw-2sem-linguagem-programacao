package br.edu.unifil.lp1.consulta.controle;
import java.util.ArrayList;
import java.util.Scanner;
import br.edu.unifil.lp1.consulta.controle.CadastroDeConsultas;
import br.edu.unifil.lp1.consulta.modelo.Consulta;
import br.edu.unifil.lp1.consulta.modelo.ConsultaPrata;
import br.edu.unifil.lp1.consulta.modelo.ConsultaDiamante;
import br.edu.unifil.lp1.consulta.modelo.ConsultaOuro;
import br.edu.unifil.lp1.consulta.modelo.ConsultaFamilia;
public class CadastroDeConsultas{
    // Instances
    ArrayList <Consulta> listaConsultas = new ArrayList();
    Scanner teclado = new Scanner(System.in);
    // Methods
    public static void getMenuConsulta(){
        System.out.println("Consulta: ");
        System.out.println("[1] - Prata");
        System.out.println("[2] - Diamante");
        System.out.println("[3] - Ouro");
        System.out.println("[4] - Familia");
        System.out.println("[9] - Menu Principal");
    }
    public void cadastrar(){
        Consulta consulta;
        System.out.println("Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Matricula: ");
        String matricula = teclado.nextLine();
        System.out.println("Nº de Dependentes: ");
        int numeroDependentes = teclado.nextInt();
        System.out.println("Ano de Inclusão: ");
        int anoInclusao = teclado.nextInt();
        System.out.println("Valor da Consulta: ");
        double valorConsulta = teclado.nextDouble();
        CadastroDeConsultas.getMenuConsulta();
        int tipoConsulta = teclado.nextInt();
        switch(tipoConsulta){
            case 1: 
                consulta = new ConsultaPrata();
                consulta.setNome(nome);
                consulta.setMatricula(matricula);
                consulta.setNumeroDependentes(numeroDependentes);
                consulta.setAnoInclusao(anoInclusao);
                consulta.setValorConsulta(valorConsulta);
                listaConsultas.add(consulta);
                break;
            case 2: 
                consulta = new ConsultaDiamante();
                consulta.setNome(nome);
                consulta.setMatricula(matricula);
                consulta.setNumeroDependentes(numeroDependentes);
                consulta.setAnoInclusao(anoInclusao);
                consulta.setValorConsulta(valorConsulta);
                listaConsultas.add(consulta);
                break;
            case 3: 
                consulta = new ConsultaOuro();
                consulta.setNome(nome);
                consulta.setMatricula(matricula);
                consulta.setNumeroDependentes(numeroDependentes);
                consulta.setAnoInclusao(anoInclusao);
                consulta.setValorConsulta(valorConsulta);
                listaConsultas.add(consulta);
                break;
            case 4: 
                consulta = new ConsultaFamilia();
                consulta.setNome(nome);
                consulta.setMatricula(matricula);
                consulta.setNumeroDependentes(numeroDependentes);
                consulta.setAnoInclusao(anoInclusao);
                consulta.setValorConsulta(valorConsulta);
                listaConsultas.add(consulta);
                break;
            case 9: 
                System.out.println("Até logo");
                break;
            default:
                System.out.println("Erro - Opção Inválida");
                break;
        }
        teclado.nextLine();
    }
    public void consultaIsValid(){
        Consulta consulta;
        for(int i = 0; i < listaConsultas.size(); i++){
            consulta = listaConsultas.get(i);
            if(consulta.getNome().equals(null) || consulta.getNome().equals("")){
                System.out.println("Erro - Nome inválido");
                listaConsultas.remove(consulta);
            }else if(consulta.getMatricula().length() != 5 || consulta.getMatricula().equals("")){
                System.out.println("Erro - Matrícula Inválida");
                listaConsultas.remove(consulta);
            }else if(consulta.getNumeroDependentes() < 0){
                System.out.println("Erro - Número de dependentes inválido");
                listaConsultas.remove(consulta);
            }else if(consulta.getAnoInclusao() < 1900){
                System.out.println("Erro - Ano inválido");
                listaConsultas.remove(consulta);
            }else if(consulta.getValorConsulta() <= 0){
                System.out.println("Erro - Valor de consulta inválido");
                listaConsultas.remove(consulta);
            }
        }
    }
    public String getConsultaPorPlano(String nomePlano){
        Consulta consulta;
        String classConsulta = "";
        String saida = "Listagem por Plano:  \n";
        int contador = 0;
        for(int i = 0; i < listaConsultas.size(); i++){
            consulta = listaConsultas.get(i);
            classConsulta = consulta.getClass().toString().replaceFirst("class br.edu.unifil.lp1.consulta.modelo.Consulta", "")
            .toLowerCase();
            if(classConsulta.equals(nomePlano.toLowerCase())){
                ++contador;
                saida += contador +  ". Matricula: " + consulta.getMatricula() + " - Nome: " + consulta.getNome() + "\n";
            }        
        }
        return saida;
    }
    public int getNumeroDeConsultas(String nomePlano){
        Consulta consulta;
        String classConsulta;
        String saida = "Quantidade: ";
        int numeroConsultas = 0;
        for(int i = 0; i < listaConsultas.size(); i++){
            consulta = listaConsultas.get(i);
            classConsulta = consulta.getClass().toString().replaceFirst("class br.edu.unifil.lp1.consulta.modelo.Consulta", "")
            .toLowerCase();
            if(classConsulta.equals(nomePlano.toLowerCase())){
                numeroConsultas++;
            }
        }
        return numeroConsultas;
    }
    public String getValorTotal(String nomePlano){
        Consulta consulta;
        String classConsulta;
        String saida = "Valor Total: R$";
        double valorTotal = 0;
        for(int i = 0; i < listaConsultas.size(); i++){
            consulta = listaConsultas.get(i);
            classConsulta = consulta.getClass().toString().replaceFirst("class br.edu.unifil.lp1.consulta.modelo.Consulta", "")
            .toLowerCase();
            if(classConsulta.equals(nomePlano.toLowerCase())){
                valorTotal += (consulta.getValorConsulta());
            }
        }
        return saida + valorTotal;
    }
}
