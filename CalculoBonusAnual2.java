import java.util.Scanner;
/*Feito Por Cristopher Kovalski Saporiti
*Implemente um programa que calcule o bônus anual de um funcionário de uma empresa. 
*O programa pede para o usuário os seguintes dados: Cargo do funcionário  e  salário  atual.  
*Se  o  cargo  for  diretor  o  sistema  pede  quantidade  de departamentos gerenciados.  Se  o cargo for gerente  o  sistema  pede  
*a quantidade de pessoas gerenciadas. Não é necessário fazer tratamento de entrada de dados. 
*O cálculo do bônus anual segue as seguintes regras.a.Para Diretor:i.4 salários + R$3000,00 por departamento gerenciadob.
*Para Gerentei.2 salários + R$100,00 por pessoa gerenciadac.Analistai.1 saláriod.Programadori.0,8 salárioe.Auxiliarde Limpezai.0,5 salário*/

public class CalculoBonusAnual2{
	public static void main(String[] args){ 
		String[] Cargos = {"Diretor", "Gerente", "Programador", "Auxiliar de Limpeza"};
		double bonus = 0;
		double Salario = 0 ;
		int x, y;
		
	   Scanner sc = new Scanner (System.in);
	   System.out.println ("Escolha as opções correspondentes ao cargo para calcular o bonus: \n 1 - Diretor, 2 - Gerente, 3 - Programador, 4 - Auxiliar de limpeza.");
	   x = sc.nextInt();
	   System.out.println ("Insira o valor do Salário");
	   Salario = sc.nextDouble();
		switch (x){
			case 1 : System.out.println ("insira a quantidade de departamentos gerenciados");
			x--;
			y = sc.nextInt();
			bonus = ((Salario * 4) + (3000 * y));
			break;
			case 2 : System.out.println ("insira a quantidade de pessoas gerenciadas");
			x--;
			y = sc.nextInt();
			bonus =((Salario * 2) + (100 * y));
			break;
			case 3 : x--;
			 bonus = (Salario * 0.8);
			break;
			case 4 : x--;
			bonus = (Salario * 0.5);
			break;
				default: 
				System.out.println("o valor inserido é inválido");
				return;
	}
	System.out.println("o valor do bonus anual de " + Cargos[x] + " = R$ " + bonus);
	}
}