package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaDiamante extends Consulta{
    // Methods
    public double getValorConsulta(){
        return (super.getValorConsulta()/100) * 60;
    }
}
