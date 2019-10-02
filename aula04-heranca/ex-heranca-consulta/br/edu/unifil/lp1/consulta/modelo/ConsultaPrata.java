package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaPrata extends Consulta{
    // Methods
    public double getValorConsulta(){
        return super.getValorConsulta() * 0.80;
    }
}
