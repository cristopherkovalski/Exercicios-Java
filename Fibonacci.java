import java.util.Scanner;
/*Feito Por Cristopher Kovalski Saporiti
 Escreva um programa que tenha como entrada do usuário, através do teclado, um número inteiro positivo. Imprima a série de Fibonacci
 (0, 1 , 1, 2, 3, 5, 8, 13, 21, ...)
 até que o número da série seja maior que o número fornecido pelo usuário.
 */
public class Fibonacci{
  public static void main (String[] args){
  int a = 1;
  int b = 0;
  int aux, c; 
  
  Scanner sc = new Scanner (System.in);
  System.out.println ("Insira valor máximo da sequência Fibonacci");
  c = sc.nextInt();
  while (a <= c){
  System.out.println(a);
  aux = a;
  a = a + b;
  b = aux;
  }
  }
}