import java.util.Scanner;
public class LiquidificadorApp{
    public static void main(String args[]){
        //Variáveis
        int escolheLiquid = 0;
        int menu = 0;       
        //Instâncias
        Scanner teclado = new Scanner(System.in);
        LiquidificadorAnalogico analogico1 = new LiquidificadorAnalogico(10);
        LiquidificadorDigital digital1 = new LiquidificadorDigital(5);
        
        System.out.println("Escolha o Liquidificador");
        System.out.println("(1) - Analógico");
        System.out.println("(2) - Digital");
        
        escolheLiquid = teclado.nextInt();
        switch(escolheLiquid){
            case 1:
                System.out.println("Liquidificador Analógico");
                System.out.println("[1] - Mudar velocidade Máxima");
                System.out.println("[2] - Aumentar velocidade");
                System.out.println("[3] - Diminuir velocidade Máxima");
                System.out.println("[4] - Dados do Liquidificador");
                System.out.println("[5] - Menu");
                System.out.println("[9] - Desligar");                
                while(menu != 9){
                    menu = teclado.nextInt();
                    switch(menu){
                        case 1:
                            System.out.println("Qual a nova Velocidade Máxima?");
                            analogico1.setVelocidadeMaxima(teclado.nextInt());
                            break;                     
                        case 2:
                            analogico1.aumentarVelocidade();
                            System.out.println("Velocidade " +  analogico1.getVelocidade() + " de " + analogico1.getVelocidadeMaxima());
                            break;
                        case 3:
                            analogico1.diminuirVelocidade();
                            System.out.println("Velocidade " +  analogico1.getVelocidade() + " de " + analogico1.getVelocidadeMaxima());
                            break;
                        case 4:
                            System.out.println("Modelo: Analógico");
                            System.out.println("Velocidade Máxima: " + analogico1.getVelocidadeMaxima());
                            System.out.println("Velocidade Atual: " + analogico1.getVelocidade());
                            break;                       
                        case 9:
                            System.out.println("Até logo!");
                            break;
                        default:                           
                            System.out.println("[1] - Mudar velocidade Máxima");
                            System.out.println("[2] - Aumentar velocidade");
                            System.out.println("[3] - Diminuir velocidade Máxima");
                            System.out.println("[4] - Dados do Liquidificador");
                            System.out.println("[5] - Menu");
                            System.out.println("[9] - Desligar"); 
                            break;
                            
                    }
                }
                break;
            case 2:
                System.out.println("Liquidificador Digital");
                System.out.println("[1] - Mudar velocidade Máxima");
                System.out.println("[2] - Alterar velocidade");
                System.out.println("[3] - Dados do Liquidificador");
                System.out.println("[4] - Menu");
                System.out.println("[9] - Desligar");                
                while(menu != 9){
                    menu = teclado.nextInt();
                    switch(menu){
                        case 1:
                            System.out.println("Qual a nova Velocidade Máxima?");
                            digital1.setVelocidadeMaxima(teclado.nextInt());
                            break;                     
                        case 2:
                            digital1.trocarVelocidade(teclado.nextInt());
                            System.out.println("Velocidade " +  digital1.getVelocidade() + " de " + digital1.getVelocidadeMaxima());
                            break;
                        case 3:
                            System.out.println("Modelo: Digital");
                            System.out.println("Velocidade Máxima: " + digital1.getVelocidadeMaxima());
                            System.out.println("Velocidade Atual: " + digital1.getVelocidade());
                            break;                       
                        case 9:
                            System.out.println("Até logo!");
                            break;
                        default:                           
                            System.out.println("Liquidificador Digital");
                            System.out.println("[1] - Mudar velocidade Máxima");
                            System.out.println("[2] - Alterar velocidade");
                            System.out.println("[3] - Dados do Liquidificador");
                            System.out.println("[4] - Menu");
                            System.out.println("[9] - Desligar");  
                            break;
                            
                    }
                }
                break;    
        }       
    }   
}