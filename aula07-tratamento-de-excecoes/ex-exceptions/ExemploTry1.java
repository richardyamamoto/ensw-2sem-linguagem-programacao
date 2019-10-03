import java.util.Scanner;
import java.util.InputMismatchException;
public class ExemploTry1
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        /* 1) faça um try..catch para tratar a entrada de dados do array a*/
        for (int elementA: a) {
            try{
                System.out.print("A: ");
                elementA = teclado.nextInt();
            }catch(InputMismatchException err){
                System.out.println(err.getMessage());
                err.printStackTrace();
                teclado.nextLine();
            }catch(Exception err){
                System.out.println("Ocorreu uma excecao");
                err.getMessage();
                err.printStackTrace();
                teclado.nextLine();
            }
        }
        /* 2) Após testar o item 1, altere o catch para utilizar a exceção generica */
 
        /* 3) faça um try com catch para tratar a entrada de dados do array b e divisão por zero */
        
        for (int i = 0; i < a.length; i++) {
            try{ 
                System.out.print("B: ");
                b[i] = teclado.nextInt();
                c[i] = a[i] / b[i];
            }catch(InputMismatchException | ArithmeticException err){
                System.out.println("Erro - Apenas numeros inteiros");
                teclado.nextLine();
            }
        }

        /* 4) Que exceções podem ocorrem no trecho abaixo? Se for informado 5 na entrada de dados o que acontece?
           *    Faça o tratamento de exceção. */
        int indice;
        for (int i = 0; i < 4; i++) {
            try{
                System.out.print("Informe o indice para consultar um valor no array c: ");
                indice = teclado.nextInt();
                System.out.println(c[indice]);
            }catch(InputMismatchException | ArithmeticException | ArrayIndexOutOfBoundsException err){
                System.out.println(err.getMessage());
                err.printStackTrace();
                teclado.nextLine();
            }catch(Exception err){
                System.out.println(err.getMessage());
                err.printStackTrace();
                teclado.nextLine();
            }
        } 
    }
}