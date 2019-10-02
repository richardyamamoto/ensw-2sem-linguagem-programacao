package br.edu.unifil.lp1.consulta.modelo;
public class Consulta{
    // Attributes
    private String nome;
    private String matricula;
    private int numeroDependentes;
    private int anoInclusao;
    private double valorConsulta;
    // Methods
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
        
    public int getNumeroDependentes(){
        return this.numeroDependentes;
    }
    public void setNumeroDependentes(int numeroDependentes){
        this.numeroDependentes = numeroDependentes;
    }
    
    public int getAnoInclusao(){
        return this.anoInclusao;
    }
    public void setAnoInclusao(int anoInclusao){
        this.anoInclusao = anoInclusao;
    }
    
    public double getValorConsulta(){
        return this.valorConsulta;
    }
    public void setValorConsulta(double valorConsulta){
        this.valorConsulta = valorConsulta;
    }
}
