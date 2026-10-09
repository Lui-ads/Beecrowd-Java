import java.io.IOException;
import java.util.Scanner;
// Exercícios
// 1019, 1020, 1021, 1035, 1036, 1037

//public class Main {

//    public static int[] formula(int t){
//        int h = (int) t / 3600;
//        int r1 = h * 60;
//        int r2 = (int) t / 60;
//        int m = r2 - r1;
//        int r3 = h * 3600;
//        int r4 = m * 60;
//        int r5 = r3 + r4;
//        int s = t - r5;
//
//        return new int[] {h, m, s};
//    }
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int[] resposta = formula(t);
//        System.out.print(String.format("""
//%d:%d:%d
//""", resposta[0], resposta[1], resposta[2]));

//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int idade = sc.nextInt();
//        int ano = (int) idade / 365;
//        int c1 = ano;
//        int c2 = c1 * 365;
//        int c3 = idade - c2;
//        int mes = (int) c3 / 30;
//        int c4 = mes;
//        int c5 = c4 * 30;
//        int c6 = c3 - c5;
//        int dia = (int) c6 / 1;
//        int c7 = dia;
//        int c8 = c7 * 1;
//        int c9 = c6 - c8; // ?
//        System.out.print(String.format("""
//%d ano(s)
//%d mes(es)
//%d dia(s)
//""", ano, mes, dia));
//        sc.close();

//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int c = (int)Math.round(sc.nextDouble() * 100);
//
//        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
//        int[] moedas = {100, 50, 25, 10, 5, 1};
//
//        System.out.println("NOTAS:");
//        for (int n : notas) {
//            System.out.println(c / n + " nota(s) de R$ " + String.format("%.2f", n / 100.0));
//            c %= n;
//        }
//
//        System.out.println("MOEDAS:");
//        for (int m : moedas) {
//            System.out.println(c / m + " moeda(s) de R$ " + String.format("%.2f", m / 100.0));
//            c %= m;
//        }
//
//        sc.close();

//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String [] entrada = sc.nextLine().split(" ");
//        int a = Integer.parseInt(entrada[0]);
//        int b = Integer.parseInt(entrada[1]);
//        int c = Integer.parseInt(entrada[2]);
//        int d = Integer.parseInt(entrada[3]);
//
//        if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
//            System.out.println("Valores aceitos");
//        }else{
//            System.out.println("Valores nao aceitos");
//        }
//
//        sc.close();

//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String [] entrada = sc.nextLine().split(" ");
//        double a = Double.parseDouble(entrada[0]);
//        double b = Double.parseDouble(entrada[1]);
//        double c = Double.parseDouble(entrada[2]);
//        double t = 2 * a;
//        double delta = b * b;
//        double delta1 = a * c;
//        double delta2 = 4 * delta1;
//        double delta3 = delta - delta2;
//        if(delta3<0 || a==0 || delta3 == 0){
//            System.out.println("Impossivel calcular");
//        }else{
//         double f = Math.sqrt(delta3);
//         double r13 = -b + f;
//         double r1 = r13 / t;
//         double r23 = -b - f;
//         double r2= r23 / t;
//         System.out.printf("R1 = %.5f%n", r1);
//         System.out.printf("R2 = %.5f%n", r2);
//        }
//        sc.close();

//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        double v = sc.nextDouble();
//        if (v >= 0 && v <= 25) {
//            System.out.println("Intervalo [0,25]");
//        } else if (v > 25 && v <= 50) {
//            System.out.println("Intervalo (25,50]");
//        } else if (v > 50 && v <= 75) {
//            System.out.println("Intervalo (50,75]");
//        } else if (v > 75 && v <= 100) {
//            System.out.println("Intervalo (75,100]");
//        } else {
//            System.out.println("Fora de intervalo");
//        }
//        sc.close();
//    }
//}
