/* 1030 - Flavious Josephus Legend

        """
1 ≤ NC ≤ 30

Entrada:
    n (1 ≤ n ≤ 10000) e k (1 ≤ k ≤ 1000)

casos = Números de casos
n = Quantas pessoas
k = quantos ao mesmo tempo se vão

J(n,k)=(J(n−1,k)+k) mod n - x % n

Caso base
    J(1,k)=0

Para o Beecrowd use a clase Main
public class Main
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sobrevivente = 0;
            for (int j = 2; j <= n; j++){
                sobrevivente = (sobrevivente + k) % j;
            }
            System.out.println("Case " + (i+1) + ": " + (sobrevivente + 1));
        }
    }
}
