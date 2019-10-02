package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaFamilia extends Consulta{
    // Methods
    public double getValorConsulta(){
        if(super.getNumeroDependentes() > 2){
            return (super.getValorConsulta()/100) * 50;
        }else{
            return super.getValorConsulta();
        }
    }
}
