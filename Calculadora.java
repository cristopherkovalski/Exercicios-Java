import java.util.Scanner; 
/*Feito Por Cristopher Kovalski Saporiti
*Implemente um programa que receba da linha de comando 3 argumentos.
*O primeiro  e  o  segundo  argumento  são  números  reais  e  o  terceiro  argumento  é  a operação*/
 
public class Calculadora{
	public static void main(String[] args){
	try{
		double num1, num2, resultado; //declaração de variáveis 
		char operador;
		Scanner sc= new Scanner (System.in); //  Declara scanner para receber os valores do teclado
		System.out.println("Insira dois números"); // to do: possivelmente implementar uma estrutura de repetição/validação
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("Insira um operador: + , - , * , / ");
		operador= sc.next().charAt(0);
		switch(operador){  //seleção de operação
			case '+' : System.out.println(resultado = num1+num2);
			break;
			case '-' : System.out.println(resultado = num1-num2);
			break;
			case '*' : System.out.println(resultado = num1*num2);
			break;
			case '/' : System.out.println(resultado = num1/num2);
			break;
			default: System.out.println("Erro de operação");
			return;
		}
		System.out.println("O valor da operação é igual: " + resultado);
	}catch (Exception e) {
		System.out.println ("Erro de operação"); // retorna excessão e encerra o programa caso não sejam inseridos números ou divisão por zero. 
		}
	}
}