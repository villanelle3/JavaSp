public class Teste {
    public static void main(String[] args) {

        String versaoJava = System.getProperty("java.version");
        System.out.println("Versão do Java instalada: " + versaoJava);

        // Verificar a pasta de instalação do Java
        String pastaInstalacao = System.getProperty("java.home");
        System.out.println("Pasta de instalação do Java: " + pastaInstalacao);

        // Verificar se o Java Runtime Environment está disponível
        try {
            Class.forName("java.awt.Toolkit");
            System.out.println("Java Runtime Environment (JRE) está disponível.");
        } catch (ClassNotFoundException e) {
            System.out.println("Java Runtime Environment (JRE) não está disponível.");
        }
    }
}

// javac Teste.java
// java Teste
