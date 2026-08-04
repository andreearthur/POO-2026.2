import java.util.Scanner;

public class Media2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double [][] matriz = new double[3][3];
for (int i = 0; i < 3; i++){
    System.out.println("Digite as notas do aluno " + (i+1));
    System.out.println("Digite a nota da Avaliação 1: ");
    matriz [i] [0] = sc.nextDouble();
     System.out.println("Digite a nota da Avaliação 2: ");
    matriz [i] [1] = sc.nextDouble();
    
    matriz [i] [2] = Math.round((matriz [i][0] + matriz [i][1])/2);

} 

for (int i = 0; i < 3; i++){
System.out.println("Aluno " + (i+1) + ":" +
" A1: " + matriz [i][0] +
" A2: " + matriz [i][1] +
" Média: " + matriz [i][2]

);





}












sc.close();
    }
    
}