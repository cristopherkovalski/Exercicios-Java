import java.util.Scanner;
/*Feito Por Cristopher Kovalski Saporiti
 Construa um programa que leia os coeficientes de uma equação do segundo grau do teclado e mostre os valores de x da equação;
 Não é necessário validar tipos de raízes;
 */
public class EquacaoSegundo{
	public static void main (String[] args) { 
	int a, b, c, d = 1;
	double delta, x1 ,x2;
do{
	try{
	Scanner sc = new Scanner (System.in);
	System.out.println ("Para calcular o valor de x. Insira o valor de a");
	a = sc.nextInt();
	System.out.println ("Insira o valor de b");
	b = sc.nextInt();
	System.out.println ("Insira o valor de c");
	c = sc.nextInt();
	delta = Math.pow (b,2) - (4 * a * c);
	x1 = (-b + Math.sqrt(delta))/ (2 * a);
	x2 = (-b - Math.sqrt(delta))/ (2 * a);
	System.out.println("Valor de x1 é = " + x1 + "\n Valor de x2 é = " + x2);
	d=0;
	}catch(Exception e){
			System.out.println ("Erro de operação");}
			}while (d == 1);
}
}