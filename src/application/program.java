package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        double[] vect =  new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o valor para alocar no vetor: ");
            vect[i] = sc.nextDouble();

        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;

        System.out.printf("Média aritimetica = %.2f%n " ,media);









        sc.close();

    }
}
