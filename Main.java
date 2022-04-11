import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
  //Variavel
  double Area =0.0,
         base = 0.0,
         altura = 0.0;
// Entrada de dados 
 System.out.print("Base :");
 base = leitor.nextDouble();
 System.out.println ("altura :");
 altura = leitor.nextDouble();
 //Processamento 
 Area = (base * altura) /2;
 //Saida
 System.out.println("Área : "+ Area );

  }
}