import java.util.Scanner;
import java.util.Formatter;
/* Feito Por Cristopher Kovalski Saporiti
Construa  um  programa  que  leia  do  teclado  dois  pontos  em  um plano (x,y) e informe a distância entre eles.
 */
public class DistanciaXY {
	public static void main (String[] args){
		String x1, x2, y1, y2;
		int a = 1;
		Double xi1,xi2,yi1,yi2, resultado;
	do{                        // Estrutura de validação simples, sempre que inserido valores inválidos mantem loop de validacao
		try{
		Scanner sc = new Scanner (System.in);
		Formatter formatter = new Formatter();
		System.out.println ("Para calcular a distancia entre dois pontos. \n Insira a primeira posição a partir de x1");
		x1 = sc.nextLine();
		xi1 = Double.parseDouble(x1);
		System.out.println ("\n Insira a primeira posição a partir de y1");
		y1 = sc.nextLine();
		yi1 = Double.parseDouble(y1);
		System.out.println ("os valores inseridos são x1 = " + xi1 + " y1 = " + yi1);
		System.out.println ("\n Agora insira a segunda posição a partir de x2");
        x2 = sc.nextLine();
        xi2 = Double.parseDouble(x2);
        System.out.println ("\n Insira a segunda posição a partir de y2"); 
        y2= sc.nextLine();
        yi2 = Double.parseDouble(y2);	
		System.out.println ("os valores inseridos são x2 = " + xi2 + " y2 = " + yi2);
        System.out.println ("\n\n Calculando o valor da distância entre os pontos");
		resultado = Math.sqrt (Math.pow(xi2 - xi1, 2) + Math.pow(yi2 - yi1,2));
		formatter.format ("%.2f", resultado); //  formata valor
		System.out.println ("\n o resultado é = " + formatter); //retorna valor formatado
		a=0; // Se o programa recebeu valor válido, chave passa a ser 0 e encerra
		}catch(Exception e){
			System.out.println ("Erro de operação");} // pseudoexcessão para dados inválidos
	}while (a == 1);// chave mantem o loop até ser inserido valor válido
	}
}