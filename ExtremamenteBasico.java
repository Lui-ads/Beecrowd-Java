// Para o Beecrowd use a clase Main
// public class Main
// Beecrowd | 1001 - Extremamente Básico

import java.util.Scanner;

// Para o Beecrowd use a clase Main
// public class Main
public class ExtremamenteBasico {
    public static void main (String [] args){
        Scanner leitura = new Scanner(System.in);
        int a = leitura.nextInt();
        int b = leitura.nextInt();
        int x = a + b;
        System.out.printf("X = %d\n", x);
        leitura.close();
    }
}
