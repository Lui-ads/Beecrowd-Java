import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Exercícios do Beecrowd do 1002 até o 1018
public class Main {
    // 1002
//    public static double resposta(double r){
//        double r2 = r * r;
//        double PI = 3.14159;
//        double area = r2 * PI;
//        return area;
//    }
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        double r = sc.nextDouble();
//        double resposta_pronta = resposta(r);
//        System.out.printf(String.format("""
//    A=%.4f
//    """, resposta_pronta));
//    }

    // 1004
//        public static void main(String[] args) throws IOException {
//            Scanner sc = new Scanner(System.in);
//            int valor1 = sc.nextInt();
//            int valor2 = sc.nextInt();
//            int resposta = valor1 * valor2;
//            System.out.print(String.format("""
//PROD = %d
//""", resposta));
//        }

    // 1005
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float valor1 = sc.nextFloat();
//        float valor2 = sc.nextFloat();
//        double resposta = (((valor1 * 3.5) + (valor2 * 7.5))/11);
//        float respostaPronta = (float) resposta;
//        System.out.printf("MEDIA = %.5f%n", resposta);
//    }

    // 1006
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        double valor1 = sc.nextDouble();
//        double valor2 = sc.nextDouble();
//        double valor3 = sc.nextDouble();
//        double resposta = (((valor1 * 2) + (valor2 * 3) + (valor3 * 5))/10);
//        System.out.printf("MEDIA = %.1f%n", resposta);
//    }

    // 1007
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int valor1 = sc.nextInt();
//        int valor2 = sc.nextInt();
//        int valor3 = sc.nextInt();
//        int valor4 = sc.nextInt();
//        int resposta = ((valor1 * valor2) - (valor3 * valor4));
//        System.out.printf("DIFERENCA = %d%n", resposta);
//    }

    // 1008
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float valor1 = sc.nextFloat();
//        float tempo = sc.nextFloat();
//        float sl = sc.nextFloat();
//        float calculo = tempo * sl;
//        System.out.printf("NUMBER = %.0f%n", valor1);
//        System.out.printf("SALARY = U$ %.2f%n", calculo);
//    }

    // 1009
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String nome = sc.nextLine();
//        double sl = sc.nextFloat();
//        double vendas = sc.nextFloat();
//        double resposta = (((vendas * 15) / 100) + sl);
//        System.out.printf("TOTAL = R$ %.2f%n", resposta);
//    }

    // 1010
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float v1 = sc.nextFloat(), v2 = sc.nextFloat(), v3 = sc.nextFloat();
//        float v4 = sc.nextFloat(), v5 = sc.nextFloat(), v6 = sc.nextFloat();
//        float resposta = ((v3 * v2) + (v5 * v6));
//        System.out.printf("VALOR A PAGAR: R$ %.2f%n", resposta);
//    }

    // 1011
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        double r = sc.nextDouble();
//        double pi = 3.14159;
//        double rAoCubo = Math.pow(r, 3);
//        double p1 = 4.0 / 3;
//        double p2 = p1 * pi;
//        double p3 = p2 * rAoCubo;
//        double resposta = p3;
//        System.out.printf("VOLUME = %.3f%n", resposta);
//        sc.close();
//    }

    // 1012
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat();
//        double pi = 3.14159;
//        float at = a * c;
//        float r1 = at / 2;
//        float ac = c * c;
//        double r2 = pi * ac;
//        float t = a + b;
//        float t2 = t * c;
//        float r3 = t2 / 2;
//        float r4 = b * b;
//        float r5 = a * b;
//        System.out.printf("TRIANGULO: %.3f%n", r1);
//        System.out.printf("CIRCULO: %.3f%n", r2);
//        System.out.printf("TRAPEZIO: %.3f%n", r3);
//        System.out.printf("QUADRADO: %.3f%n", r4);
//        System.out.printf("RETANGULO: %.3f%n", r5);
//        sc.close();
//    }

    // 1013
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int[] lista = new int[3];
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//        lista[0] = a;
//        lista[1] = b;
//        lista[2] = c;
//        int maximo = Arrays.stream(lista).max().getAsInt();
//        System.out.printf("%d eh o maior%n", maximo);
//        sc.close();
//    }

    // 1014
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        float resposta = a / b;
//        System.out.printf("%.3f km/l%n", resposta);
//        sc.close();
//    }

    // 1015
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float x1 = sc.nextFloat(), y1 = sc.nextFloat();
//        float x2 = sc.nextFloat(), y2 = sc.nextFloat();
//        float c1 = x2 - x1;
//        float c2 = c1 * c1;
//        float c3 = y2 - y1;
//        float c4 = c3 * c3;
//        float c5 = c2 + c4;
//        float resposta = (float) Math.sqrt(c5);
//        System.out.printf("%.4f%n", resposta);
//        sc.close();
//    }

    // 1016
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float resposta = a * 2;
//        System.out.printf("%.0f minutos%n", resposta);
//        sc.close();
//    }

    // 1017
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        float h = sc.nextFloat();
//        float kmh = sc.nextFloat();
//        float resposta = (kmh / 12) * h;
//        System.out.printf("%.3f%n", resposta);
//        sc.close();
//    }

    // 1018
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int valor = sc.nextInt();
//
//        System.out.println(valor);
//
//        int[] notas = {100, 50, 20, 10, 5, 2, 1};
//
//        for (int nota : notas) {
//            int qtd = valor / nota;
//            System.out.printf("%d nota(s) de R$ %d,00%n", qtd, nota);
//            valor = valor % nota;
//        }
//
//        sc.close();
//    }
}
