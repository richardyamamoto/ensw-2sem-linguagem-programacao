public class LiquidificadorAnalogico extends Liquidificador{   
    public LiquidificadorAnalogico(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
    //Métodos
    public void aumentarVelocidade(){
        int velocidade = super.getVelocidade();
        if(velocidade < super.getVelocidadeMaxima()){
            velocidade ++;
            super.setVelocidade(velocidade);
        }             
    } 
    
    public void diminuirVelocidade(){
        int velocidade = super.getVelocidade();
        if(velocidade > 0){
            velocidade --;
            super.setVelocidade(velocidade);
        }       
    } 
}
