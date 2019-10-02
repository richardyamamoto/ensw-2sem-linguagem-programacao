public class Liquidificador{
    //Atributos
    private int velocidade;
    private int velocidadeMaxima;
    //Construtor
    public Liquidificador(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    //Métodos
    public void setVelocidadeMaxima(int velocidadeMaxima){
        if(velocidadeMaxima > 0){
            this.velocidadeMaxima = velocidadeMaxima;
            System.out.println("Velocidade Máxima computada com sucesso!");
        }
    }
    
    public void setVelocidade(int velocidade){
        if(velocidade >= 0){
            this.velocidade = velocidade;
        }
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
}