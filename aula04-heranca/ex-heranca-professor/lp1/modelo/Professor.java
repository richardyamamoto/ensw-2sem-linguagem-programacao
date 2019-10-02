package lp1.modelo;
public class Professor extends Pessoa{
    // Atributos
    private String titulacao;

    // Construtor
    public Professor(String nome, String titulacao){
        super(nome);
        this.titulacao = titulacao;
    }
    
    // Metodos
    public String getTitulacao(){
        return this.titulacao;
    }
}
