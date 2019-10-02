package lp1.controle;
import lp1.modelo.Disciplina;
import lp1.modelo.Professor;
import java.util.ArrayList;
public class Controle{
    // Atributos
    ArrayList <Disciplina> listaDisciplinas = new ArrayList();
    ArrayList <Professor> listaProfessores = new ArrayList();  
    
    // Metodos
    public void cadastrarProfessor(String nomeProfessor, String titulacao){
        listaProfessores.add(new Professor(nomeProfessor, titulacao));
    }
    public Professor getProfessor(String nomeProfessor){
        Professor prof;
        for(int i = 0; i < listaProfessores.size(); i++){
            prof = listaProfessores.get(i);
            if(prof.getNome().toLowerCase().equals(nomeProfessor.toLowerCase())){
                return prof;
            }else{
                return null;
            }
        }
        return null;
    }
        public String getProfessorPorTitulacao(String titulacao){
        Professor prof;
        int contador = 0;
        String saida = "Titulação procurada: " + titulacao.toLowerCase() + ": \n"; 
        for(int i = 0; i < listaProfessores.size(); i++){
            prof = listaProfessores.get(i);
            if(prof.getTitulacao().toLowerCase().equals(titulacao.toLowerCase())){
                contador++;
                saida +=contador + ". " +  prof.getNome() + "\n";
           }
        }
        return saida; 
    }
    public void cadastrarDisciplina(String nomeDisciplina, String nomeProfessor, String titulacao){
        Professor professor;
        Disciplina disciplina;
        if(getProfessor(nomeProfessor) != null){
            professor = getProfessor(nomeProfessor);
            disciplina = new Disciplina(nomeDisciplina, nomeProfessor, professor.getTitulacao(), professor);
            listaDisciplinas.add(disciplina);
            System.out.println("*Professor existente cadastrado a disciplina");
        }else{
            professor = new Professor(nomeProfessor, titulacao);
            disciplina = new Disciplina(nomeDisciplina, nomeProfessor, titulacao, professor);
            listaProfessores.add(professor);
            listaDisciplinas.add(disciplina);
            System.out.println("*Novo professor cadastrado a disciplina");
        }
    }
    public String getDisciplina(String nomeDisciplina){
        Disciplina disciplina;
        Professor professor;
        String saida = "Disciplina: \n";
        int contador = 0;
        for(int i = 0; i < listaDisciplinas.size(); i++){
            disciplina = listaDisciplinas.get(i);
            if(disciplina.getNomeDisciplina().toLowerCase().equals(nomeDisciplina.toLowerCase())){
                professor = disciplina.getProfessor();
                contador++;
                saida +=contador + ". " +  disciplina.getNomeDisciplina() + " | Professor: " + professor.getNome() + " | Titulação: "
                + professor.getTitulacao() + "\n";
            }
        }
        return saida;
    }
    public String getTodasDisciplinas(){
        String saida = "Disciplinas: \n";
        Disciplina disciplina;
        int contador = 0;
        for(int i = 0; i < listaDisciplinas.size(); i++){
            disciplina = listaDisciplinas.get(i);
            contador++;
            saida +=contador + ". " + disciplina.getNomeDisciplina() + "\n";
        }
        return saida;
    }
    public String getTodosProfessores(){
        Professor prof;
        int contador = 0;
        String saida = "Lista de Professores: "; 
        for(int i = 0; i < listaProfessores.size(); i++){
            prof = listaProfessores.get(i);
            contador++;
            saida +=contador + ". " +  prof.getNome() + " | Titulação: " + prof.getTitulacao();
        }
        return saida; 
    }
}
