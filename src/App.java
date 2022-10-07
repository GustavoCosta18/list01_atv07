import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a medita do lado do quadrado: ");
        int lado = sc.nextInt();
        sc.close();

        int area = lado * lado;

        int dobro = area * 2;

        System.out.println("O dobro da área do quadrado de lado " + lado + " é igual a " + dobro);
    }
}