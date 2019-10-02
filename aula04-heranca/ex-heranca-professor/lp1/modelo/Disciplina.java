package lp1.modelo;
import lp1.modelo.Professor;
public class Disciplina{
    // Atributos
    private String nomeDisciplina;
    
    Professor professor;
    // Construtor
    public Disciplina(String nomeDisciplina, String nomeProfessor, String titulacao, Professor professor){
        this.nomeDisciplina = nomeDisciplina;
        this.professor = new Professor(nomeProfessor, titulacao);
    }
    
    // Metodos
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public Professor getProfessor(){
        return professor;
    }
}
