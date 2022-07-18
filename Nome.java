import java.util.Scanner;
public class Nome {

  public static void main(String[] args) {
  String nome;
  String partes[];
  int x;
  try{
  Scanner sc = new Scanner (System.in);
  System.out.println ("insira o seu nome");
  nome= sc.nextLine();
    partes = nome.split(" ");
    int n = partes.length;
	x=n;
	System.out.println ("\n");
	while (n>0){
		n--;
		System.out.println (partes[n] + "\n");
		}
	}catch (Exception e){
		System.out.println ("Erro");
   }  
  }
}