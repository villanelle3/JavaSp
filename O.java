import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        double a, b;
        a = 9;
        b = 10;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = teclado.nextInt();

        System.out.println(a+b);
        ++valor; // prefixado
        System.out.println(valor);

        teclado.close();
    }
}

// javac Teste.java
// java Teste
// del Teste.class
