import java.util.Scanner;
public static void main(String[] args){
Scanner sc = new Scanner(System.in);


char continuar = 's';
String[] dias = new String[5];
String[] disc = new String[5];
int posicao = 0;
while ((continuar == 's') && posicao < 5) {
    System.out.println("Digite a sigla da matéria:");
    disc[posicao] = sc.nextLine();
    System.out.println("Informe os dias da semana de aula ou não para encerrar:");
    dias[posicao] = sc.nextLine();
    posicao++;
    if (posicao < 5) {
        System.out.println("Deseja continuar o cadastro? (s/n)");
continuar = sc.nextLine().charAt(0);
    }   else{
        System.out.println("Número maximo de matérias atingido!");
    }
    }
System.out.println("Relatório final:");
for (int i =0; i < posicao; i++){
    System.out.println("A disciplina " + disc[i] + " tem aula em: " + dias[i]);
}
}

