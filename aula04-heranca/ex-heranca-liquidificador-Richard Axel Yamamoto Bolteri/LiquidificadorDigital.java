public class LiquidificadorDigital extends Liquidificador{
    public LiquidificadorDigital(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
    //Métodos
    public void trocarVelocidade(int velocidade){
        if(velocidade <= super.getVelocidadeMaxima()){
            super.setVelocidade(velocidade);
        }else{
            System.out.println("#Erro - Velocidade excede Velocidade Máxima");
        }
    }
}