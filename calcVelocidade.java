import java.util.Scanner;
/* Feito Por Cristopher Kovalski Saporiti
*Faça uma classe executável que dados a distância percorrida (em Km)  e  o  tempo  gasto  em  uma  viagem  (em  horas), 
 * informe  a  velocidade média do carro, sabendo que Velocidade = S / T (variação de distância / variação do tempo). 
 * Imprima o valor com duas casas decimais.
 */
public class calcVelocidade {
public static void main(String[] args) {
String tempo, dist; 
int x = 1;
double t,d,v;
	Scanner sc = new Scanner (System.in);
	do{
	try{
	System.out.println("insira o tempo em horas");
	tempo = sc.nextLine();
	t = Double.parseDouble(tempo);
	System.out.println("insira a distancia em quilometros");
		dist= sc.nextLine();
		d = Double.parseDouble(dist);
		v = d/t;
		x= 0;
	System.out.println ("\n o resultado é : " + v + "Km/h");
	}catch(Exception e){
	System.out.println ("Erro de operação");}
}while (x == 1);

}
}