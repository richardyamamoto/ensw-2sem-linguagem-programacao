package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaOuro extends Consulta{
    // Methods
    public double getValorConsulta(){
        if(super.getAnoInclusao() <= 2000){
            return super.getValorConsulta() * 0;
        }else{
            return (super.getValorConsulta()/100) * 70;
        }
    }
}
