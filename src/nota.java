import java.util.Scanner;

import Classes.Nota;

public class nota {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Qual a matéria que você deseja calcular?");
            String materia = sc.nextLine();

            System.out.println("Quantas notas serão colocadas?");
            int n = sc.nextInt();

            System.out.println("Quais foram as notas?");
            Nota[] vect = new Nota[n];
            for(int i = 0; i < n; i++) {
                double nota = sc.nextDouble();
                vect[i] = new Nota(nota);
            }

            double sum = 0.0;
            for(int i = 0; i < n; i++) {
                sum += vect[i].getNota();
            }

            double media = sum / n;

            if(media == 10) {
                System.out.println(materia.toUpperCase() + ":");
                System.out.printf("Nota Perfeita!!! --- %.2f%n", media);
            }else if(media > 7 && media < 10) {
                System.out.println(materia.toUpperCase() + ":");
                System.out.printf("Otima Nota! --- %.2f%n", media);
            }else if(media == 7) {
                System.out.println(materia.toUpperCase() + ":");
                System.out.printf("Passou --- %.2f%n", media);
            }else if(media < 7 && media >= 4) {
                System.out.println(materia.toUpperCase() + ":");
                System.out.printf("Recuperação --- %.2f%n", media);
            }else {
                System.out.println(materia.toUpperCase() + ":");
                System.out.printf("Reprovado!!! --- %.2f%n", media);
            }
        }

    }
}
