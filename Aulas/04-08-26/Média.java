import java.util.Scanner;

public class Média {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu nome:");
String nome = sc.nextLine();
System.out.println("Digite sua primeira nota:");    
double nota1 = sc.nextDouble();
System.out.println("Digite sua segunda nota:");    
double nota2 = sc.nextDouble();
double media = (nota1 + nota2) / 2;
double mediaofc = Math.round(media);

if (mediaofc >= 7) {
System.out.println("Parabéns " + nome + ", você foi aprovado com uma média: " + mediaofc + "!");

    
}else{
    System.out.println("Olá " + nome + ", você foi reprovado pois sua média (" + mediaofc + ") é menor que a média mínima (7)");
}
sc.close();
    }
    
}